package com.abhishek.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.abhishek.bindings.Student;
import com.abhishek.service.StudentService;

import lombok.Data;



@Controller
public class StudentController {
	@Autowired
	private StudentService service;

	@GetMapping ("/")
	public String loadIndexPage(Model model) {
		
		formInitBinding(model);
		
		return "index";
	}
	private void formInitBinding(Model model) {
		model.addAttribute("student", new Student());
		model.addAttribute("courses",service.getCourses());
		model.addAttribute("preftimings",service.getTimings());
	}
	@PostMapping("/save")
	public String saveStudents(Student s,Model model) {
		boolean isSaveStudent=service.saveStudent(s);
		if(isSaveStudent)
		model.addAttribute("msg", "Data Saved Successfully"); 
		formInitBinding(model);
		return "index";
	}
}
