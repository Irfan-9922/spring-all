package com.ij.beans;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class interreplacer implements MethodReplacer {
	
private float interrate;
public interreplacer()
{
	System.out.println("0 param cunstructor");
}
	public void setInterrate(float interrate) {
	this.interrate = interrate;
}
	public Object reimplement(Object bean , Method method, Object[] arg)
			throws Throwable {
		float payment=((float) arg[0]);
		float time=((float)arg[1]);
		return payment*time*interrate/100.0f;
	}

}
