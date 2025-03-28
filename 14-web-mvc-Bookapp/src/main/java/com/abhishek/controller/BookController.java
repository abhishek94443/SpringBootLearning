package com.abhishek.controller;

import java.util.Optional;	

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.abhishek.entity.Book;
import com.abhishek.repository.BookRepository;

@Controller
public class BookController {
    @Autowired
	private BookRepository repo;
    @GetMapping("/book")
	public ModelAndView getBookById(@RequestParam("id") Integer id) {
    	System.out.println(id);
		ModelAndView mav=new ModelAndView();
		Optional<Book> findById = repo.findById(id);
		if(findById.isPresent()) {
			 Book bookobj = findById.get();
			 System.out.println(bookobj);
			 mav.addObject("book",bookobj);
			
		}
		mav.setViewName("index");
		
		return mav;
	}
}
