package com.pbl.controller;

import org.springframework.web.bind.annotation.RestController;


import com.pbl.model.Users;
import com.pbl.service.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class UserController {
	@Autowired
	UserService service;
	@PostMapping("/register")
	public Users registerUser(@RequestBody Users user) {
		//TODO: process POST request
		
		return service.registerUser(user) ;
	}
	@GetMapping("/users")
	public List<Users> getstudent(){
		return service.getUsers();
	}
	@PostMapping("/login")
	public String  login(@RequestBody Users user) {
		//TODO: process POST request
		
		return service.verify(user);
	}

	

}
