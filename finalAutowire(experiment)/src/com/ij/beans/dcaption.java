package com.ij.beans;

public class dcaption {
	private String cr;
	public void setCr(String cr) {
		this.cr = cr;
	}
	public void setFb(String fb) {
		this.fb = fb;
	}
	public void setBd(String bd) {
		this.bd = bd;
	}
	public void setHk(String hk) {
		this.hk = hk;
	}
	private String fb;
	private String bd;
	private String hk;
	@Override
	public String toString() {
		return "dcaption [cr=" + cr + ", fb=" + fb + ", bd=" + bd + ", hk="
				+ hk + "]";
	}
	

}
