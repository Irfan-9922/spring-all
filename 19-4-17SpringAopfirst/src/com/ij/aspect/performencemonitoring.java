package com.ij.aspect;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class performencemonitoring implements MethodInterceptor{
    long start,end;
	@Override
	public Object invoke(MethodInvocation invoketion) throws Throwable {
		// TODO Auto-generated method stub
		start=System.currentTimeMillis();
	float retValue=(float) invoketion.proceed();
	System.out.println("actual value ::"+retValue);
	end=System.currentTimeMillis();
      
		return retValue+2000;
		
	
	

	}
	
}
