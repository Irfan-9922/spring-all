package com.ij.beans;

public class Bike {
	private String bikeid;
	private String make;
	private String engcc;
	public void setBikeid(String bikeid) {
		this.bikeid = bikeid;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public void setEngcc(String engcc) {
		this.engcc = engcc;
	}
	@Override
	public String toString() {
		return "Bike [bikeid=" + bikeid + ", make=" + make + ", engcc=" + engcc
				+ "]";
	}

}
