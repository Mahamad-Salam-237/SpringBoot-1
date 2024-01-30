package com.example.demo.persistance;

import java.util.List;


import com.example.demo.entity.Employee;


public interface EmployeeDAO {
	public List<Employee> findall();
	public Employee findById(int id);
	public void save(Employee employee);
	public void deleteById(int id);
	
	}
