package aop.keroro;

public class Keroro {
	public void before()
	{
		System.out.println("Keroro 비포");
	}
	public void afterReturning(Object res)
	{
		System.out.println("케로로 리터닝:" +res);
	}
}
