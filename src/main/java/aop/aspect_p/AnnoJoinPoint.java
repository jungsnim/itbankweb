package aop.aspect_p;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//@Component
//@Aspect
public class AnnoJoinPoint {
	
	//@Pointcut("execution(public * aop.model..*(..))")
	void target22(){System.out.println("");}
	
	//@Around("target22() || execution(public * aop.model2..*(..))")
	Object cartoon(ProceedingJoinPoint joinpoint) throws Throwable
	{
		System.out.println("beforeAnno:"+joinpoint.getSignature().toShortString());
		Object res = null;
		try{
			res = joinpoint.proceed();
			System.out.println("AfterReturningAnno:들어왔네");
			System.out.println(res);
		}
		catch (Exception e)
		{
			System.out.println("AfterThrowingAnno"+e.getMessage());
		}
		finally
		{
			System.out.println("After"+joinpoint.getSignature().toShortString() +"끝");
		}
		return "밍또";
	}
}
