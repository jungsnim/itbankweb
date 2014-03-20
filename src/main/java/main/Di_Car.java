package main;

import model.car.Car;
import model.car.Sport;
import model.car.Tire;
import model.computer.Computer;
import model.computer.DeskTop;
import model.computer.NoteBook;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Di_Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cont = {"xml/anno_car.xml"};
		
		AbstractApplicationContext context =
				new ClassPathXmlApplicationContext(cont);
		
		
		/*Car car = context.getBean("f1",Car.class); 
		car.Data();*/
		//context.getBean("f1",Car.class).Data();
		System.out.println(context.getBean("Nexen",Tire.class));
		//System.out.println(context.getBean("Hankook",Tire.class));
		System.out.println(context.getBean("scoope",Sport.class));
	}

}
