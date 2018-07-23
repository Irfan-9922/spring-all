package com.ij.beans;

public class home {
	private String fname;
	private String mname;
	
	
	
	
	public home(String fname, String mname) {
		System.out.println("o param costructor");
		this.fname = fname;
		this.mname = mname;
	}
	
	@Override
	public String toString() {
		return "home [fname=" + fname + ", mname=" + mname + "]";
	}

}
