package com.ij.test;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ij.service.calculet;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/ij/cfg/applicationContext.xml");
		calculet proxy=(calculet) ctx.getBean("pmadvice");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name:");
		
		float s=proxy.hikesal(20, 2);
		System.out.println(s+"your hiked salary");
		System.out.println("second method");
	float r=proxy.purches("denim jeans", 2000, 2);
System.out.println(r+"print the coupon");

	}

}
