package com.ij.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ij.aspect.auditing;
import com.ij.service.approver;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/ij/cfg/applicationContext.xml");
  approver proxy=(approver) ctx.getBean("bean");
System.out.println("order"+proxy.approvorder(12121));
	}

}
