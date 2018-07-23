package com.ij.beans;

public class engin {
	private String engid;
	public String getEngid() {
		return engid;
	}
	public String getType() {
		return type;
	}
	private String type;
	public void setEngid(String engid) {
		this.engid = engid;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "engin [engid=" + engid + ", type=" + type + "]";
	}
	


}
