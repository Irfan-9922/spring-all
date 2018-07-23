package com.ij.aspect;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class Aspect_Test implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation src) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("you are in aspect test class");
		System.out.println("befor exicuting");
		long start=System.currentTimeMillis();
		Object ret=src.proceed();
		Object s=src.proceed();
	
		System.out.println(ret+"ret");
		float sal=(float) ret;
		if(sal >2000){
			System.out.println("you are elligable for shopping");
			return s;
		}
		else
			System.out.println("you are not elligable for shopping");
			return ret;
		
		
	
	}

}
