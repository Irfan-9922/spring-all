package com.ij.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class viche {
	
	@Autowired
	@Qualifier(value="e1")
	private String engg;
	public void setEngg(String engg) {
		this.engg = engg;
	}
	@Override
	public String toString() {
		return "viche [engg=" + engg + "]";
	}

}
