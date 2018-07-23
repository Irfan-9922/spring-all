package com.ij.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class oly {
private	String spid;
public oly()
{
	System.out.println("from oly");
	
}
public void setSpid(String spid) {
	this.spid = spid;
}

public void call()
{
	BeanFactory fact=new XmlBeanFactory(new FileSystemResource("src/com/ij//cfg/AppContext.xml"));
	sports s=fact.getBean("sport",sports.class);
	s.football();
}
}
