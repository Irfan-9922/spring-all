package com.ij.beans;

public class dclass {
	private String dname;
	private String dage;


	public void setDname(String dname) {
		this.dname = dname;
	}
	public void setDage(String dage) {
		this.dage = dage;
	}
	@Override
	public String toString() {
		return "dclass [dname=" + dname + ", dage=" + dage + "]";
	}
	
}
