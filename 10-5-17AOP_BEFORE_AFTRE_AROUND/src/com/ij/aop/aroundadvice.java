package com.ij.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class aroundadvice implements MethodInterceptor{

	@Override
	//implement from methodinterceptors interface
	//get current system time  for steart time 
	//invoke the method by using obje.proceed
	//get ending time 
	public Object invoke(MethodInvocation inv) throws Throwable {
		// TODO Auto-generated method stub
		long start;
		long end;
		start=System.currentTimeMillis();
		Object ob=inv.proceed();
		end=System.currentTimeMillis();
		System.out.println("program takes"+(end-start)+"time to complet exicution");
		System.out.println("around target method");
		return ob;
	}

}
