package com.ij.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.ij.beans.WishGenrator;

public class ClientApp {

	public static void main(String[] args) {
		System.out.println("jkgjkg");
		//locate  spring bean confogration  file 
		FileSystemResource res=new FileSystemResource("src/com/ij/cfg/AppContext.xml");
		//activate bean factory container
		XmlBeanFactory factory =new XmlBeanFactory(res);
		//get bean class object
		WishGenrator bean=factory.getBean("wsg", WishGenrator.class);
		//call b method 
		String result=bean.genrateWishmsg();
		System.out.println(result);
		

	}

}
