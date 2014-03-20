package main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Di_Config {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] cont = {"xml/di_config.xml"};
		
		AbstractApplicationContext context =
				new ClassPathXmlApplicationContext(cont);
		
		System.out.println(context.getBean("datasource"));
		
	}

}
