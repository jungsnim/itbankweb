package main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/////////////
//자동차를 출력하세요
/// 자동차 - 인터페이스
//// 자동차 종류 - 클래스
//F1 --- 바퀴, 부스터
//리무진 ---- 바퀴, 방음벽
//트럭 ---- 바퀴, 짐칸
//// 자동차 부품 - 인터페이스
//// 자동차 부품 종류 - 클래스

public class Di_HomeWork_Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cont = {"xml/di_hwcar.xml"};
		
		AbstractApplicationContext context =
				new ClassPathXmlApplicationContext(cont);
		
		System.out.println(context.getBean("f1"));
		System.out.println(context.getBean("truck"));
		System.out.println(context.getBean("limu"));
	}

}
