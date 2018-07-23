package com.ij.beans;

public class tclass {
	
	
public tclass(dplayer p, dteam s, dcaption d) {
		
		this.p = p;
		this.s = s;
		this.d = d;
	}
private dplayer p;
	public void setP(dplayer p) {
	this.p = p;
}
	private dteam s;
	public void setS(dteam s) {
		this.s = s;
	}
	public void setD(dcaption d) {
		this.d = d;
	}
	private dcaption d;
	@Override
	public String toString() {
		return "tclass [p=" + p + ", s=" + s + ", d=" + d + "]";
	}
	

}
