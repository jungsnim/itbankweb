package aop.aspect_p;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AnnoAdvice {
	
	@Pointcut("execution(public * aop..*(..))")
	void target22(){System.out.println("");}
	
	@Before("target22()")
	public void before()
	{
		System.out.println("B4 다");
	}
	@AfterReturning(returning="res",pointcut="target22()")
	public void afterReturning(Object res)
	{
		System.out.println("메소드 실행 후 리턴:" +res);
	}
	@AfterThrowing(pointcut="target22()",throwing="e")
	public void afterThrowing(Throwable e)
	{
		System.out.println("메소드 실행 시 예외:" +e.getMessage());
	}
	@After("target22()")
	public void ffinally()
	{
		System.out.println("보아다");
	}
	
}
