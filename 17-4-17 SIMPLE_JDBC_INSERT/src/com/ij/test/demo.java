package com.ij.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ij.dto.studentdto;
import com.ij.service.studentservice;

public class demo {
	public static void main(String[] args) {
		ApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/ij/cfg/ApplicationContext.xml");
		studentservice se=(studentservice) ctx.getBean("irfan");
	
	
		studentdto dt=new studentdto();
		dt.setName("irfan");
		dt.setNo(12222);
		dt.setAdress("nashik");
		//System.out.println("enter the record"+se.enter("nisar",1,"jim"));
		System.out.println("enter the record"+se.register(dt));
	//	System.out.println("enter the record"+se.all());
	}
  
}
