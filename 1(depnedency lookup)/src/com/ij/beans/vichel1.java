package com.ij.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class vichel1 {
private String engid;
	public vichel1()
	{
		System.out.println("0 param costructore from vichel");
		
	}
	public void setEngid(String engid) {
		this.engid = engid;
	}
	public void start()
	{
		BeanFactory bean=new XmlBeanFactory(new FileSystemResource("src/com/in/cfg/AppContext.xml"));
		engine e=bean.getBean("eng",engine.class);
		e.engbrand();
	e.engtype();
		e.engprice();
		
	}

}
