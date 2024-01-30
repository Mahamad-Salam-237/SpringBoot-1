package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeServiceImpl;

@RestController
@RequestMapping("/details")
public class EmployeeController {
	@Autowired
	EmployeeServiceImpl employeeservice;
				//localhost:8080/details/employees
	@GetMapping("/employees")
	public List<Employee> show()
	{
		return employeeservice.fetchAll();
	}
	
	@GetMapping("/employees/{EmpId}")
	public Employee showById(@PathVariable int EmpId) 
	{
		Employee employee=employeeservice.fetchById(EmpId);
		if(employee==null)
		{
			throw new RuntimeException("Employee id is not founded:"+EmpId); 
		}
		return employee;
	}
	
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee employee)
	{
//		employee.setId(0);
		employeeservice.save(employee);
		return employee;
	}
	
	@PutMapping("/employee")
	public Employee Update(@RequestBody Employee employee)
	{
		employeeservice.save(employee);
		return employee;
	}
	
	@DeleteMapping("/employee/{employeeid}")
	public String deleteById(@PathVariable int employeeid) 
	{
		Employee employee =employeeservice.fetchById(employeeid);
		if(employee==null)
		{
			throw new RuntimeException("Id not Existed"+employeeid);
		}
		employeeservice.deleteById(employeeid);
		return "Employee details deleted consisting of id:"+employeeid;
	}
	
	
}
