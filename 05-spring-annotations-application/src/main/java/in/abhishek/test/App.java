package in.abhishek.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import in.abhishek.config.AppConfig;

public class App {
	public static void main(String []args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);

	}

}
