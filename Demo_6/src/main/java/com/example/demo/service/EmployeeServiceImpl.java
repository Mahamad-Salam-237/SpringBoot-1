package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Employee;
import com.example.demo.persistance.EmployeeDAOImpl;

@Service
public class EmployeeServiceImpl implements Employeeservice {
	@Autowired
	EmployeeDAOImpl employeedao;
	
	
	public List<Employee> fetchAll() {
		return employeedao.findall();		
	}

	
	@Override
	@Transactional
	public Employee fetchById(int id) {
		return employeedao.findById(id);
	}

	@Override
	@Transactional
	public void save(Employee employee) {
		employeedao.save(employee);
	}

	@Override
	@Transactional
	public void deleteById(int id) {
		employeedao.deleteById(id);
	}

}
