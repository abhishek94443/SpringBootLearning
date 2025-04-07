package com.pbl.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pbl.model.Student;

import jakarta.servlet.http.HttpServletRequest;
@RestController
public class StudentController {
	private List<Student> students=new ArrayList<>(
			List.of(new Student(1, "Abhishek", 99),
					new Student(2, "aman", 90)));
	
	@GetMapping("/students")
	public List<Student> getstudent(){
		return students;
	}
	@GetMapping("/csrf")
	public CsrfToken csrfToken(HttpServletRequest req) {
		return (CsrfToken) req.getAttribute("_csrf");
	}
	@PostMapping("/students")
	public Student setstudent(@RequestBody Student stu){
		students.add(stu);
		return stu;
	}


}
