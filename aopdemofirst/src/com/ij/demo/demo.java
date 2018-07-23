package com.ij.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ij.service.calculet;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/ij/config/applicationContext.xml");
		calculet proxy=(calculet) ctx.getBean("bean");
        //call b method 
		Float d=proxy.intramt(20001, 3, 20);
		System.out.println("inter amt"+d);
		System.out.println("============================");
	}

}
