package com.ij.beans;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class offer implements MethodReplacer {
	public Object divali;

	public void setDivali(Object divali) {
		this.divali = divali;
	}
	public offer()
	{
		System.out.println("0 param cunstructor");
	}

	@Override
	public Object reimplement(Object bean, Method method, Object[] arg)
			throws Throwable {
		String item=((String)arg[0]);
		String prise=((String )arg[1]);
		int batch=((int)arg[2]);
		
		// TODO Auto-generated method stub
		return "\nphon"+""+123+""+12;
	}

}
