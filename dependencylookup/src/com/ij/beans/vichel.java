package com.ij.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class vichel {
	private String engid;
	public vichel()
	{
		System.out.println("0 oaram cunstructor ::from vichel");
	}//end of constructor
	public void setEngid(String engid) {
		this.engid = engid;
	}
	public void move()
	{
		BeanFactory fact=new XmlBeanFactory(new FileSystemResource("src/com/ij/cfg/AppContext.xml"));
		engine e=fact.getBean("eng",engine.class);
		e.start();
		System.out.println("vichel is mooved for the gerney");
	}
	

}//end oc
