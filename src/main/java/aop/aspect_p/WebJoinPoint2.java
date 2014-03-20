package aop.aspect_p;

import org.aspectj.lang.ProceedingJoinPoint;

public class WebJoinPoint2 {
	Object cartoon(ProceedingJoinPoint joinpoint) throws Throwable
	{
		System.out.println("before2222222:"+joinpoint.getSignature().toShortString());
		Object res = null;
		
		res = joinpoint.proceed();
		System.out.println("AfterReturning22222222222:들어왔네");
		return "싱글플레이어22222222";
	}
}
