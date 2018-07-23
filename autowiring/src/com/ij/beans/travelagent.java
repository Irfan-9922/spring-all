package com.ij.beans;

public class travelagent {
	private tourplan tp;
	public travelagent()
	{
		System.out.println("0 param cunstructor");
		this.tp=tp;
	}
	public travelagent(tourplan tp) {
		//super();
		System.out.println("1 param xonstructor");
		this.tp = tp;
	}
	@Override
	public String toString() {
		return "travelagent [tp=" + tp + "]";
	}
	 
	
	

}
