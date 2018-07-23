/**JAVA BOSS IRFAN @ COPYRIGHTS 2017 ALL RIGHTS RESERVED
 * 
 */
package com.ij.aspect;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

/**
 * @author :IRFAN
 *DATE:09-May-2017
*TIME:12:17:24 PM
*TODO
 */
public class After_Advice implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object f, Method arg1, Object[] arg2, Object arg3) throws Throwable {
		// TODO Auto-generated method stub
		float ma=(float) f;
		if(ma>10)
			System.out.println("demo");
		else
			System.out.println("leleo");
		
	}

	

}
