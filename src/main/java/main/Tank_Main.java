package main;

import model.tank.ITankParts;
import model.tank.Tank;
import model.tank.Tank_Config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Tank_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		ApplicationContext context = new AnnotationConfigApplicationContext(Tank_Config.class);
		
		Tank tank = context.getBean("tank",Tank.class);
		System.out.println(tank);
		
		
	}

}
