package com.example.demo.game;

public class GameRunner {
	
	private GameConsole game;

	public GameRunner(GameConsole game) {
		this.game = game;
	}
	
	public void run()
	{
		game.up();
		game.down();
		game.left();
		game.right();
	}

}

/* Here we achieved loose coupling by interface like we hae not taken 
 the class variable in th GameRunner but taken it for Interface and 
 in main method for whatever class we wan to execute we execute by using 
 creation of that class obj in the GameRunner class */