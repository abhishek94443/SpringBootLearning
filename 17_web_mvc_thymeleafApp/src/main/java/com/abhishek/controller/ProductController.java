package com.abhishek.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.abhishek.entity.Product;
import com.abhishek.repo.ProductRepository;


@Controller
public class ProductController {
	@Autowired
	private ProductRepository repo;
	@GetMapping("/edit")
	public String edit(@RequestParam("pid") Integer pid, Model m) {
		Optional<Product> findById=repo.findById(pid);
		if(findById.isPresent()) {
			Product product=findById.get();
			m.addAttribute("p", product);
		}
		return "index";
	}
	
	@GetMapping("/delete")
	public String deleteProduct(@RequestParam("pid") Integer pid, Model m) {
		repo.deleteById(pid);
		m.addAttribute("msg","Product Deleted");
		m.addAttribute("products",repo.findAll());
		return "data";
	}
	
	@PostMapping("/product")
	public String saveProduct(@Validated @ModelAttribute("p") Product p,BindingResult result, Model m) {
		if(result.hasErrors())return "index";
		repo.save(p);
		m.addAttribute("msg", "Product Saved Successfully");
		return "index";
	}
	
	
	@GetMapping("/products")
	public String getAllProducts(Model m) {
		List<Product> list=repo.findAll();
		m.addAttribute("products",list);
		return"data";
	}
	
	@GetMapping("/")
	public String loadForm(Model model) {
	    int a=10/0;
		model.addAttribute("p",new Product());
		return "index";
	}

}
