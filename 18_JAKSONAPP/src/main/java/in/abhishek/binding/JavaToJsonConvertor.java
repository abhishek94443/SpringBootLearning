package in.abhishek.binding;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

public class JavaToJsonConvertor {
	public static void main(String[] args) throws Exception {
		Customer c = new Customer();
		c.setEmail("abhishekdwivedi94443@gmail.com");
		c.setId(1);
		c.setName("Abhishek Dwivedi");
		c.setPhone(8319866927l);
		
		Address address=new Address();
		address.setCity("Shahdol");
		address.setCountry("India");
		address.setState("Madhya Pradesh");
		c.setAddr(address);
		ObjectMapper oMapper=new ObjectMapper();
		oMapper.writeValue(new File("customer.json"), c);
		System.out.println("done");
		
	}

}
