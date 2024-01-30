package com.example.demo.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/show")
			
public class MainController {
	
//		localhost:8080/hello
	
	@GetMapping("/hello")
	public String sayHello()
	{
		return "Present Date and Time and chiru and abdul and sankaram and mounika is:"+LocalDateTime.now();
	}
//	@GetMapping("/hello1")
//	public String sayHello1()
//	{
//		return "Present Date and Time 2 is is :"+LocalDateTime.now();
//	}
}


//I am displaying the date 