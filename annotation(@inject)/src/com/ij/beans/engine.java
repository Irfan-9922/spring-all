package com.ij.beans;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Value;

@Named("eng")
public class engine {
	@Value("123")
	private String engid;
	

	@Value("water")
	private String type;
	public void setEngid(String engid) {
		this.engid = engid;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "engine [engid=" + engid + ", type=" + type + "]";
	}
}
