package com.ij.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class com {
	@Autowired
	public void setName(String name) {
		this.name = name;
	}



	private String name;
	private String city;

	
	@Autowired(required=true)
	public void setCity(String city) {
		this.city = city;
	}



	@Override
	public String toString() {
		return "com [name=" + name + ", city=" + city + "]";
	}

	

}
