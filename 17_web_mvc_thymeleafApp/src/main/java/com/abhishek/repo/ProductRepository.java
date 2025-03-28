package com.abhishek.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhishek.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
