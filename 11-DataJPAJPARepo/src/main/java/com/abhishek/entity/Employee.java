package com.abhishek.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="emp_tbl")
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Integer empID;
	private String empName;
	private Double empSalary;
	private String empGender;
	private String dept;
	
	@CreationTimestamp
	@Column(name = "Date_Created", updatable = false)
	private LocalDate dateCreated;
	
	@UpdateTimestamp
	@Column(name = "Date Updated", insertable = false)
	private LocalDate dateupdated;
	

}
