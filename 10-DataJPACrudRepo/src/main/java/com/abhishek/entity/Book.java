package com.abhishek.entity;


//import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
//import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
//@Table(name = "BookId")
public class Book {
	@Id
//	@Column
	private Integer bookId;
	private  String bookNameString;
	private Double bookPrice;

}
