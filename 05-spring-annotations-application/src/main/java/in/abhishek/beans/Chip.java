package in.abhishek.beans;

import org.springframework.stereotype.Component;

@Component
public class Chip {
	public Chip(){
	System.out.println("chip constructor");
}
	
	public String chipType() {
		return "32-bit";
	}

}
