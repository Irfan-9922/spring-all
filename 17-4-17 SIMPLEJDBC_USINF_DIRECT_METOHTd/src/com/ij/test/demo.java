package com.ij.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ij.dto.stdto;
import com.ij.service.stservice;

public class demo {
	public static void main(String[] args) {
		ApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/ij/cfg/ApplicationContext.xml");
		stservice se=(stservice) ctx.getBean("irfan");
	
	
		
		//System.out.println("enter the record"+se.enter("nisar",1,"jim"));
		System.out.println("enter the record"+se.byno(1));
		System.out.println("enter the record"+se.all());
	}
  
}