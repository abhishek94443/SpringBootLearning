package com.pbl.model;

import lombok.Data;

@Data
public class Student {
private int id;
private String name;
private int marks;
public Student(int id, String name, int marks) {
	super();
	this.id = id;
	this.name = name;
	this.marks = marks;
}

}
