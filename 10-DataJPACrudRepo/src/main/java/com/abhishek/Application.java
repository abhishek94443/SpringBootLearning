package com.abhishek;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.abhishek.entity.Book;
import com.abhishek.repo.BookRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	   ConfigurableApplicationContext ctxt=	SpringApplication.run(Application.class, args);
	   BookRepository repo=ctxt.getBean(BookRepository.class);
//	   Book b=new Book();
//	   b.setBookId(101);
//	   b.setBookNameString("Java");
//	   b.setBookPrice(3000.05);
//	   repo.save(b);
//	   System.out.println("Record inserted .....");
	   
	   List <Book> byid =repo.getAllBooks();
	   for(Book b: byid)
	   System.out.println(b);
	}

}
