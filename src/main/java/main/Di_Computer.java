package main;

import model.computer.Computer;
import model.computer.DeskTop;
import model.computer.NoteBook;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Di_Computer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cont = {"xml/anno_computer.xml"};
		
		AbstractApplicationContext context =
				new ClassPathXmlApplicationContext(cont);
		
		
		DeskTop ss = context.getBean("lg",DeskTop.class);
		System.out.println(ss.getName());
		
		
		NoteBook nb = context.getBean("samsung",NoteBook.class);
		System.out.println(nb.getName());
		
		Computer com = context.getBean("samsung",Computer.class);
		System.out.println(com.getName());
		System.out.println(com.getBoard());
		
		Computer com2 = context.getBean("lg",Computer.class);
		System.out.println(com2.getName());
		System.out.println(com2.getBoard());
		
	}

}
