package com.abhishek.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {
	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to my first rest App";
	}
	@GetMapping("/greet")
	public ResponseEntity<String> greet() {
String responseBody= "messege sent";
		
		return new ResponseEntity<>(responseBody,HttpStatus.OK);
		
	}
	
	@PostMapping("/msg")
	public ResponseEntity<String> sendmsg() {
		String responseBody= "messege sent";
		
		return new ResponseEntity<>(responseBody,HttpStatus.CREATED);
	}
}
