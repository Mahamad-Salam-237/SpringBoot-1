package com.example.demo.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Mario implements GameConsole {
	
	public void up()
	{
		System.out.println("mario move up");
	}
	 public void down()
	{
		System.out.println("mario move down");	
	}
	public void left()
	{
		System.out.println("mario move left");
	}
	public void right()
	{
		System.out.println("mario move right");
	}
}
