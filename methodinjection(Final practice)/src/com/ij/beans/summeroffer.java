package com.ij.beans;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class summeroffer implements MethodReplacer {
public void setSumof(Object sumof) {
		this.sumof = sumof;
	}
public Object sumof;
public summeroffer()
{
	System.out.println("this will be gives the super calss of the class may be shift class"+super.getClass());
}
	@Override
	public Object reimplement(Object bean, Method method, Object[] arg)
			throws Throwable {
		String laptopname=((String)arg[0]);
		Object price=((Object)arg[1]);
		int discount=((int)arg[2]);
		// TODO Auto-generated method stub
		return "lenovo"+28888+""+1000;
	}

}
