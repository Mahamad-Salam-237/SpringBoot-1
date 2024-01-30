package com.example.demo.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	
	private GameConsole game;

	
	public GameRunner(@Qualifier("mario") GameConsole game) {
		this.game = game;
	}
	
	@Autowired
	public void run()
	{
		game.up();
		game.down();
		game.left();
		game.right();
	}

}
 	/* we r achieving loose coupling (i.e.,Dependency Injection) 
 	   by using "Annotations"
 	 		Here we dont create even a single obj*/
