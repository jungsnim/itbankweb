package aop.dullee;

public class Dullee {
	public void afterThrowing(Throwable e)
	{
		System.out.println("둘리에러:" +e.getMessage());
	}
	public void ffinally()
	{
		System.out.println("둘리 끝!!");
	}
}
