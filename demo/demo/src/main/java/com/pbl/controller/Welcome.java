package com.pbl.controller;

import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class Welcome {
	@GetMapping("/")
	public String wel(HttpServletRequest req) {
		return new String("hello abhishek  "+req.getSession().getId());
		
	}
	
}
