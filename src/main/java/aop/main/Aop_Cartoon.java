package aop.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop.model.Dragon;
import aop.model.LuckyJJang;
import aop.model2.Yame;

public class Aop_Cartoon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cont = {"xml/webToon.xml"};
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext(cont);
		
		System.out.println("main::"+context.getBean("dragon",Dragon.class).game());
		System.out.println("----------------------------------------------------------------");
		System.out.println("main2::"+context.getBean("luckyJJang",LuckyJJang.class).fight());
		System.out.println("----------------------------------------------------------------");
		System.out.println("main3::"+context.getBean("yame",Yame.class).cooking());
	}
}
