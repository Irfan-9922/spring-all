package com.ij.aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class afteradvice implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object obj, Method arg1, Object[] arg2, Object arg3) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("after exicuting target method method");
		
	}

}
