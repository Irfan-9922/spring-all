package com.ij.aspect;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class performence implements MethodInterceptor{
long start,end;
	@Override
	public Object invoke(MethodInvocation inv) throws Throwable {
		// TODO Auto-generated method stub
		start=System.currentTimeMillis();
		Object ret=inv.proceed();
		end=System.currentTimeMillis();
		System.out.println(inv.getMethod().getName()+"taken"+(end-start)+"time");
		return ret;
	}

}
