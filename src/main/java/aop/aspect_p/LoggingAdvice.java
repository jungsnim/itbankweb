package aop.aspect_p;

public class LoggingAdvice {
	public void before()
	{
		System.out.println("B4 다");
	}
	public void afterReturning(Object res)
	{
		System.out.println("메소드 실행 후 리턴:" +res);
	}
	public void afterThrowing(Throwable e)
	{
		System.out.println("메소드 실행 시 예외:" +e.getMessage());
	}
	public void ffinally()
	{
		System.out.println("보아다");
	}
	
}
