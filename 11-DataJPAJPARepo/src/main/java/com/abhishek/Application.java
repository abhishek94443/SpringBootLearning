package com.abhishek;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.abhishek.entity.Employee;
import com.abhishek.repository.EmployeeRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt= SpringApplication.run(Application.class, args);
		EmployeeRepository repository=ctxt.getBean(EmployeeRepository.class);
		
//		Employee e1=new Employee(2,"charles",3600.00,"male","sales");
//		Employee e2=new Employee(3,"sam",3700.00,"male","admin");
//
//		Employee e3=new Employee(4,"merry",3500.00,"male","marketing");
//
//		Employee e4=new Employee(5,"billy",3540.00,"fe-male","accounts");
//		Employee e5=new Employee(6,"donald",7500.00,"male","manager");
//		Employee e6=new Employee(7,"hilery",8500.00,"fe-male","sales");
////		repository.save(e);
//		repository.saveAll(Arrays.asList(e1,e2,e3,e4,e5,e6));
//		int pageNo=2;
//		PageRequest p=PageRequest.of(pageNo-1, 3);
//		Page<Employee> findall=repository.findAll(p);
//		List<Employee> emp=findall.getContent();
//	   Sort asc=Sort.by("empName").ascending();
//		List<Employee> emp=repository.findAll(asc);
		
		Employee e=new Employee();
		e.setEmpGender("Male");
		Example<Employee> exmp=Example.of(e);
		List<Employee> emp=repository.findAll(exmp);
		
		emp.forEach(System.out::println);
		
//		System.out.println("Report inserted...");
		
	}

}
