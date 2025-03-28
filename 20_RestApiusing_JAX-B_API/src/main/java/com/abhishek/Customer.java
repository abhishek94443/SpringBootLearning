package com.abhishek;

import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;

@Data
@XmlRootElement
public class Customer {
	private Integer id;
	private String name;
	private String email;
	private Long phone;
	
	

}
