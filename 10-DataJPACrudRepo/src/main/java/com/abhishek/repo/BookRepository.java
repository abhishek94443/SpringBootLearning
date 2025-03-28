package com.abhishek.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.abhishek.entity.Book;

public interface BookRepository extends CrudRepository<Book, Integer>{
	@Query(value = "Select * from Book", nativeQuery = true)
	public List<Book> getAllBooks();
}

