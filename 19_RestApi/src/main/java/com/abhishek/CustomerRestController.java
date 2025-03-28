package com.abhishek;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerRestController {
	@GetMapping("/")
public Customer getcustomer() {
	Customer c = new Customer();
	c.setEmail("abhishekdwivedi94443@gmail.com");
	c.setId(1);
	c.setName("Abhishek Dwivedi");
	c.setPhone(8319866927l);
	return c;
}
}
