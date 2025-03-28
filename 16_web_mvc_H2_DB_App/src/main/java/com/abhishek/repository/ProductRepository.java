package com.abhishek.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhishek.binding.Product;


public interface ProductRepository extends JpaRepository<Product, Integer> {

}
