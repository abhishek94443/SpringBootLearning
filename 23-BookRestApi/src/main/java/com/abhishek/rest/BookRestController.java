package com.abhishek.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.abhishek.entity.Book;

@RestController
public class BookRestController {
	
	@PostMapping(value = "book", consumes  = {"application/xml", "application/json"})
	public ResponseEntity<String> addBook(@RequestBody Book b){
		System.out.println(b);
		return new ResponseEntity<String>("Record Saved", HttpStatus.CREATED);
	}
	
	@GetMapping(value = "/book", produces= {"application/xml", "application/json"})
public Book getBook() {
	Book book=new Book();
	book.setId(101);
	book.setName("pyhton");
	book.setPrice(100.00);
	return book;
	}
}
