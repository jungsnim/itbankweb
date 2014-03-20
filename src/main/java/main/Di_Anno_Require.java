package main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Di_Anno_Require {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cont = {"xml/anno_require.xml"};
		
		AbstractApplicationContext context =
				new ClassPathXmlApplicationContext(cont);
		
		System.out.println(context.getBean("camera"));
		System.out.println(context.getBean("camera2"));
		
		System.out.println(context.getBean("Android"));
	}

}
