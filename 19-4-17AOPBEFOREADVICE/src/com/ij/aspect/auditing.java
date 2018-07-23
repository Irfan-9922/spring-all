package com.ij.aspect;

import java.io.FileWriter;
import java.lang.reflect.Method;
import java.util.Date;

import org.springframework.aop.MethodBeforeAdvice;

public class auditing implements MethodBeforeAdvice{

	@Override
	public void before(Method method, Object[] arg, Object target) throws Throwable {
		// TODO Auto-generated method stub
		if((Integer)arg[0]==0)throw new IllegalArgumentException("wrong id");
		FileWriter f=new FileWriter("audit.txt",true);
		int count=0;
		
		f.write(arg[0]+"order has come to approval"+new Date()+"\n"+count+count);
		
		f.flush();
		f.close();
	}

}
