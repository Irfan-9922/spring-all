package com.ij.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class dpendent {

	private String name;

	private String age;
	
	private String phno;
	@Required
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	@Override
	public String toString() {
		return "dpendent [name=" + name + ", age=" + age + ", phno=" + phno
				+ "]";
	}
	

}
