package aop.model;

import org.springframework.stereotype.Component;

@Component
public class Dragon {
	public String game()
	{
		System.out.println("빵 게임");
		return "김용씨";
	}
}
