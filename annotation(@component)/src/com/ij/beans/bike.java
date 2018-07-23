package com.ij.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("bike")
public class bike {
	@Override
	public String toString() {
		return "bike [name=" + name + ", model=" + model + ", prise=" + prise
				+ "]";
	}
	@Value("herly devidson")
	private String name;
	public void setName(String name) {
		this.name = name;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setPrise(String prise) {
		this.prise = prise;
	}
	@Value("fireform")
	private String model;
	@Value("1222121")
private	String prise;

}
