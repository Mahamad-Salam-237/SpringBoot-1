package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/display")
public class StudentController {
	//localhost:8080/display/first
	@GetMapping("/first")
	public Student display()
	{
		return new Student(101,"Salam");
	}
	
	@GetMapping("/second")
	public List<Student> display1()
	{
		List<Student> l1=new ArrayList<Student>();
		l1.add(new Student(104,"sa"));
		l1.add(new Student(105,"sz"));
		return l1;
	}
	@GetMapping("/third")
	public List<Student> display2()
	{
		return List.of(new Student(106,"dfg"),new Student(107,"dfgg"),
				new Student(108,"sxdcfgvhjkl"));
	}
}
	//	Here we are assigning static data(w/o database) to table and 
///////print it(by obj)