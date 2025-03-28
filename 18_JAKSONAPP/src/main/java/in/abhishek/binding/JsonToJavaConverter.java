package in.abhishek.binding;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;


public class JsonToJavaConverter {
public static void main(String[] args) throws Exception{
//	72 47 22 50 95
	File file=new File("customer.json");
	ObjectMapper mapper=new ObjectMapper();
	Customer c =mapper.readValue(file, Customer.class);
	System.out.println(c);
	
	
}
}
