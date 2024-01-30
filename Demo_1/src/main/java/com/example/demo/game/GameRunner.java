package com.example.demo.game;

public class GameRunner {
	private SuperMario mario;
	//inheritance
	//aggreggration

	public GameRunner(SuperMario mario) {
		
		this.mario = mario;
	}
	
	public void run()
	{
		mario.up();
		mario.down();
		mario.left();
		mario.right();
	}

}
/* if we want to use Super mario then we have to declare variable 
  in the game changer and use in run method as SuperMario.up,.....
	and in main method we have to use the use this class by creating obj 
 	and for which obj we r creating we have to use that class obj
 	(like mario or supermario) then we use pass as parameter for the
 	class of gamerunner. therefore the no of objects we r creating r
 	directly proportional to classes in this...i.e..,we r using "tight
 	connection" .. therefore inorder to make it loose (class are 
 	objection relation changes)  ...
 	==>> we use Dependency injection,this can b achieved by two ways 
 	 		1) through interface
 	 		2)through Annotation  	*/