package com.abhishek.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.abhishek.Entity.Product;
import com.abhishek.repo.ProductRepository;

@Controller

public class ProductController {
	@Autowired
	private ProductRepository repo;
	@GetMapping("/")
 public String loadForm(Model model) {
	 Product p=new Product();
	 model.addAttribute("product", p);
	 return "index";
 }
	
	@GetMapping("/products")
 public String loadProducts(Model model) {
		model.addAttribute("products", repo.findAll());

	 return "data";
 }
	@PostMapping("/save")
	public String handleSave( Product p, Model model) {
		p= repo.save(p);
		if(p.getPid()!= null)
		model.addAttribute("msg", "Product Saved Successfully");
		else {
			model.addAttribute("msg", "Product Not Saved Successfully");

		}
		return "index";
	}
}
