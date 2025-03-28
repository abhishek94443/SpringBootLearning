package com.abhishek.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abhishek.Entity.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

}
