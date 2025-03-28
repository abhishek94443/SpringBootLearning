package com.abhishek.controller;


import java.util.List;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.abhishek.binding.Product;
import com.abhishek.entity.ProductEntity;
import com.abhishek.repository.ProductRepository;
import com.abhishek.service.ProductService;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class ProductController {
	@Autowired

	
	
	@GetMapping ("/")
    public String loadIndexPage(Model model) {
		
    	model.addAttribute("product", new Product());
		return "index";
			
	}
//	@PostMapping("/save")
//	public String getProduct( Product p, Model model){
//		
//	         
//		 
//			model.addAttribute("msg", "Saved Successfully");
//		
//		return "index";
//	}
//	@GetMapping("/products")
//	public String loadProducts(Model model) {
////		List<ProductEntity> product =repo.findAll();
////		model.addAttribute("products",repo.findAll());
//		model.addAttribute("msg", "Saved Successfully");
//
//		return "save";
//	}

}
