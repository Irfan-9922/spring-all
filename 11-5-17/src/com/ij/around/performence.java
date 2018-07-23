/**JAVABOSS @COPYWRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.ij.around;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author :IRFAN
 *TIME:4:46:11 am
 * DATE:11-May-2017
 *PROJECTNAME:11-5-17
 */
@Component
@Aspect
public class performence {
	@Pointcut("execution(* com.ij.service.calculet.*(..))")
	public void  mypointcut(){
		
	}
	
	@Before(" mypointcut()")
		public void cheackInputs(JoinPoint k){
		Object hh[]=k.getArgs();
		
		if((Integer)hh[0]<=0 || (Integer)hh[1]<=0){
			System.out.println("enter value more the an 0");
		}
		else
		{
			System.out.println("thanks");
		}
		
	}
	
	@Pointcut("execution(* com.ij.service.calculet.sub(..))")
	public void  mypointcut1(){
		
	}
	@Before("mypointcut()")
	public void demo(){
		System.out.println("this is anothe beautifull example of before advice");
	}
	@Around("mypointcut()")
	public Object demoo(ProceedingJoinPoint jp) throws Throwable{
		System.out.println("around started");
		long s,e;
		s=System.currentTimeMillis();
		Object ds=jp.proceed();
		e=System.currentTimeMillis();
		System.out.println("method takes "+(e-s)+"time");
		
		return ds;
	}
	}
	
