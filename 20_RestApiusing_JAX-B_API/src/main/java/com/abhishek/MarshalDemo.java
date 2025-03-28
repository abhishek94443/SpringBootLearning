package com.abhishek;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class MarshalDemo {
	public static void main(String[] args) throws Exception {
		Customer c = new Customer();
		c.setEmail("abhishekdwivedi94443@gmail.com");
		c.setId(1);
		c.setName("Abhishek Dwivedi");
		c.setPhone(8319866927l);
		JAXBContext context = JAXBContext.newInstance(Customer.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.marshal(c, new File("customer.xml"));
		System.out.println("XML Created");
	}
}
