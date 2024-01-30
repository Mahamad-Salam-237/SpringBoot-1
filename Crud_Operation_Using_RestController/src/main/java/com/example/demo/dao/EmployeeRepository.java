package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


import com.example.demo.entity.Employee;
		//localhost:8080/employees
		//localhost:8080/people
@RepositoryRestResource(path="people")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
//taking
	//localhost:8080/employees
//	public Employee findByFirstName(String fname);
}
