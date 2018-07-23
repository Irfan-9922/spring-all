/**JAVABOSS @COPYWRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.ij.advice;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author :IRFAN
 *TIME:6:54:51 am
 * DATE:11-May-2017
 *PROJECTNAME:12-5-17Annotation-pointcutt-example
 */
@Component
@Aspect
public class advice {
	@Pointcut("execution(* com.ij.service.student.go(..))")
//	@Pointcut("execution(* com.ij.service.calculet.*(..))")
	public void pt1(){
		
	}
	@Before("pt1()")
	public void m(){
		System.out.println("please take tiffin");
	}
	@After("pt1()")
public void f(){
		System.out.println("be awarwe from thif");
	}
}
