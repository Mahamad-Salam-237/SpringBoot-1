package com.example.demo;

import org.springframework.boot.SpringApplication;


import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.game.GameRunner;
import com.example.demo.game.Mario;
import com.example.demo.game.SuperMario;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
			
		SuperMario m = new SuperMario();
		GameRunner game= new GameRunner(m);
		game.run();
	}


}
