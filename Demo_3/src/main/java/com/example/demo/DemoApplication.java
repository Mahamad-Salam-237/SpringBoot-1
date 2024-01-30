package com.example.demo;

import org.springframework.boot.SpringApplication;



import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.game.GameRunner;
import com.example.demo.game.Mario;
import com.example.demo.game.SuperMario;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context =
				SpringApplication.run(DemoApplication.class, args);
		
		GameRunner g=context.getBean(GameRunner.class);
		g.run();
	}

}
