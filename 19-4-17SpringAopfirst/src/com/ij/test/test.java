package com.ij.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ij.service.interamt;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/ij/cfg/applicationContext.xml");
//get the bean
interamt proxy=(interamt) ctx.getBean("pfb");
//call b method
float interamt=proxy.calculet(8000, 2, 20);
System.out.println("interamt"+interamt);
System.out.println("--------------------------------------------");
		
	}

}
