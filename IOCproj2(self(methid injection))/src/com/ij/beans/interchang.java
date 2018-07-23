package com.ij.beans;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class interchang implements MethodReplacer {
private  float change;
	public void setChange(float change) {
	this.change = change;
}
	public interchang()
	{
		System.out.println("0 param cunstuctor");
	}
	@Override
	public Object reimplement(Object bean, Method method, Object[] arg)
			throws Throwable {
		// TODO Auto-generated method stub
		float payment=((float)arg[0]);
		float time=((float)arg[1]);
		return payment+time;
		
	}

}
