package com.ij.aspect;

import java.lang.reflect.Method;
import java.util.Scanner;

import org.springframework.aop.MethodBeforeAdvice;

public class Aspect_Test_Befor_advice implements MethodBeforeAdvice{

	@Override
	public void before(Method m, Object[] arg1, Object arg2) throws Throwable {
		// TODO Auto-generated method stub
	
		if((float)arg1[0]==0)
			System.out.println("invalid user");
		
		else
			System.out.println("welcome user");
	}

}
