package main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Di_Heritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] cont = {"xml/di_child.xml","xml/di_parent.xml"};
		
		AbstractApplicationContext context =
				new ClassPathXmlApplicationContext(cont);
		
		System.out.println(context.getBean("sport"));
		
		System.out.println(context.getBean("suv"));
	}

}
