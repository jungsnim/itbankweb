package myweb.main;

import org.aspectj.lang.ProceedingJoinPoint;

public class WebJoin {
	Object print(ProceedingJoinPoint joinpoint) throws Throwable
	{
		System.out.println("before:"+joinpoint.getSignature().toShortString());
		Object res = null;
		try{
			res = joinpoint.proceed();
			System.out.println("AfterReturning:들어왔네");
			System.out.println(res);
		}
		catch (Exception e)
		{
			System.out.println("AfterThrowing"+e.getMessage());
		}
		finally
		{
			System.out.println("After"+joinpoint.getSignature().toShortString() +"끝");
		}
		return "밍또";
	}
}
