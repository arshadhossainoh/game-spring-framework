package com.in28minutes.hellospringframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.in28minutes.hellospringframework.game.GameRunner;

@SpringBootApplication
//@ComponentScan({"com.in28minutes.hellospringframework", "com.in28minutes.dummy"})
public class HelloSpringFrameworkApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(HelloSpringFrameworkApplication.class, args);
		
		//MarioGame, GameRunner
		GameRunner runner = context.getBean(GameRunner.class);
		
		
		//MarioGame game = new MarioGame();
		
		//SuperContraGame game = new SuperContraGame();
		
		
		//GameRunner runner = new GameRunner(game);
		
		runner.runGame();
		
		
		
	}

}
