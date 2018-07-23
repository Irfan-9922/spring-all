package com.ij.aspect;

import java.io.FileWriter;
import java.lang.reflect.Method;

import org.springframework.aop.AfterAdvice;
import org.springframework.aop.AfterReturningAdvice;

public class Aspect_Test_After_Advice implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object obj, Method m, Object[] obj1, Object obj2) throws Throwable {
		// TODO Auto-generated method stub
		float demo=(float) obj;
		obj=demo;
		FileWriter f;
		String msg=null;
		if(demo>2000)
	   msg="your shopping is more than 2000 so you are ready for prime membre";
		else
			 msg="your shopping is less than 2000 so you are not ready for prime membre";
		f=new FileWriter("demo.txt");
		f.write(msg);
		if(f!=null)
			System.out.println("writtern");
		f.flush();
		f.close();
		
	}
	

}
