package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Employee;

public interface Employeeservice {
	
	public List<Employee> fetchAll();
	public  Employee fetchById(int id);
	public void save(Employee employee);
	public void deleteById(int id);
	

}
