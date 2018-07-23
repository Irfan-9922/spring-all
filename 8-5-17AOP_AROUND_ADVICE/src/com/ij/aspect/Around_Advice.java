/**JAVA BOSS IRFAN @ COPYRIGHTS 2017 ALL RIGHTS RESERVED
 * 
 */
package com.ij.aspect;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.MethodBeforeAdvice;

/**
 * @author :IRFAN
 *DATE:09-May-2017
*TIME:12:17:24 PM
*TODO
 */
public class Around_Advice implements MethodBeforeAdvice{

	@Override
	public void before(Method m, Object[] o, Object arg2) throws Throwable {
		// TODO Auto-generated method stub
		if(m.getParameters()!=null)
			System.out.println("***********************************");
			
		
		else
			System.out.println("################################");
		
		  
		
	}

	

}
