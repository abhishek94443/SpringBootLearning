package com.abhishek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;

//import com.abhishek.entity.Product;

//import com.abhishek.request.Passenger;



@Controller
public class MakeMyTripControlller {
	
	@GetMapping("/")
	public String loadForm(Model model) {
	    
		model.addAttribute("p","jf");
		return "index";
	}

	
//	7000437411

}
