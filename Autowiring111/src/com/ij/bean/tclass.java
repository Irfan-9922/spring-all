package com.ij.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class tclass {
	
	private dcountery d;

	public void setD(dcountery d) {
		this.d = d;
	}
	public tclass(dcountery d) {
		
		this.d = d;
	}
	@Override
	public String toString() {
		return "tclass [d=" + d + "]";
	}
	



}
