package in.abhishek.binding;

import lombok.Data;

@Data
public class Customer {
	private Integer id;
	private String name;
	private String email;
	private Long phone;
	private Address addr;
	

}
