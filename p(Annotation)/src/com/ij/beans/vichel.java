package com.ij.beans;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Named("eng")
@Scope("prototype")
public class vichel {
	@Value("herly devidson")
	private String brand;
	@Value("thunder bird")
	private String mname;
	@Value("123123")
	private int prise;
	@Value("1234")
	private String cc;
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setMname(String mname) {
		this.mname = mname;
	}
	
	public void setPrise(int prise) {
		this.prise = prise;
	}
	public void setCc(String cc) {
		this.cc = cc;
		
	}
	@Override
	public String toString() {
		return "vichel [brand=" + brand + ", mname=" + mname + ", prise="
				+ prise + ", cc=" + cc + "]";
	}
	
}
