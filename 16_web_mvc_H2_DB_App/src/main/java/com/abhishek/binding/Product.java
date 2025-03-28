package com.abhishek.binding;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Product {
	@Id
	Integer pid;
	private String name;
	private long quantity;
	private double price;

}
