package com.example.demo.persistance;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
	
	//findById
	//findBYLastName(String lname)
	//NamedQuery
	public Employee findByFirstName(String lname);
	
	// write a named Query 
	// write a Searching and Sorting method
}
