package com.abhishek.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhishek.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
