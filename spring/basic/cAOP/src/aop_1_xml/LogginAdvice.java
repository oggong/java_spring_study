package aop_1_xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class LogginAdvice {
	public Object around(ProceedingJoinPoint point ) throws Throwable{
		String methodName = point.getSignature().getName();
		System.out.println("1.[사전작업] :" + methodName);
		Object obj = point.proceed();
		System.out.println("2.<사후작업> :" + methodName);
		return obj;
	}
	
	public void before(JoinPoint point) throws Throwable{
		String methodName = point.getSignature().getName();
		System.out.println("3.[*******사전작업*********] : " +methodName);
	}
	public void after(JoinPoint point) throws Throwable{
		String methodName = point.getSignature().getName();
		System.out.println("4. [*****사후작업*********] : " +methodName);
	}
}
