package com.ij.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("stud")
public class engin {
	@Value("1222")
	private  int sno;
	@Value("faradapur")
	private String add;
	public void setSno(int sno) {
		this.sno = sno;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	@Override
	public String toString() {
		return "engin [sno=" + sno + ", add=" + add + "]";
	}
	

}
