package aop.model;

import org.springframework.stereotype.Component;

@Component
public class LuckyJJang {
	public Object fight()
	{
		
		System.out.println("1사단장 나도하");
		int a = 3/0;
		return 1;
	}
}
