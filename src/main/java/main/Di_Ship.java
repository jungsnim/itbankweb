package main;

import model.car.Car;
import model.ship.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Di_Ship {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ApplicationContext context;
		try {
			String className = "Ship_Config";
			//context = new AnnotationConfigApplicationContext(Ship_Config.class);
			context = new AnnotationConfigApplicationContext(Class.forName("model.ship."+className));
			System.out.println(context.getBean("clock_1",BattleCruiser.class));
			context.getBean("f1",Car.class).Data();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
