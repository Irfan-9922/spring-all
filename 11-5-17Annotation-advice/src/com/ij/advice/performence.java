/**JAVABOSS @COPYWRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.ij.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author :IRFAN
 *TIME:3:24:57 am
 * DATE:11-May-2017
 *PROJECTNAME:11-5-17Annotation-advice
 */
@Component
@Aspect

public class performence {
	long s,e;
	//@Around("exicution(* com.ij.service.*.*(..))")
	@AfterReturning("execution(* com.ij.service.*.*(..))")
	public Object pMmonotoring(JoinPoint pjp) throws Throwable
	{
		System.out.println("****");
		/*s=System.currentTimeMillis();
		System.out.println("controlre in arojund started");
		Object d=((ProceedingJoinPoint) pjp).proceed();
		s=System.currentTimeMillis();
		System.out.println("system takes"+(e-s)+"time to complet the exicution");*/
		//Object d=((ProceedingJoinPoint) pjp).proceed();
		return pjp;
		
	}

}
