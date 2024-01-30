package com.example.demo.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SuperMario implements GameConsole {
	public void up()
	{
		System.out.println("SuperMario move up");
	}
	public void down()
	{
		System.out.println("SuperMario move down");
	}
	public void left()
	{
		System.out.println("SuperMario move left");
	}
	public void right()
	{
		System.out.println("SuperMario move right");
	}
}
