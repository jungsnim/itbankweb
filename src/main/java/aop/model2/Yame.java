package aop.model2;

import org.springframework.stereotype.Component;

@Component
public class Yame {
	public String cooking()
	{
		System.out.println("토끼야 토끼야");
		return "음식파괴자";
	}
}
