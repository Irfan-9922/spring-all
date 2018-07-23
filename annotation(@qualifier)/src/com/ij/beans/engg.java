package com.ij.beans;

public class engg {
	private String engid;
	private String engtype;

	


	public void setEngid(String engid) {
		this.engid = engid;
	}
	
	
	
	public void setEngtype(String engtype) {
		this.engtype = engtype;
	}
	
	@Override
	public String toString() {
		return "engg [engid=" + engid + ", engtype=" + engtype + "]";
	}
	
}
