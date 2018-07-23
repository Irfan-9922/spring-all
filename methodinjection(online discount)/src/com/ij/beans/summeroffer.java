package com.ij.beans;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class summeroffer implements MethodReplacer {
	public int show;
static 
{
	System.out.println("from summer");
}
	public void setShow(int show) {
		this.show = show;
	}
public summeroffer()
{
	System.out.println("0 param cunstructor");
}
	@Override
	public Object reimplement(Object bean, Method method, Object[] arg)
			throws Throwable {
		System.out.println("this is exicuted form summer");
		String brandname=((String)arg[0]);
		int size=((int)arg[1]);
		int prize=((int)arg[2]);
		int batch=((int)arg[3]);
		// TODO Auto-generated method stub
		return "siyaram"+10+1000+84;
	}

}
