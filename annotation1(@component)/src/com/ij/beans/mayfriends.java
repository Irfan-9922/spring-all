package com.ij.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("simple")
public class mayfriends {
	@Value("me")
	private String me;
	public void setMe(String me) {
		this.me = me;
	}
	public void setF1(String f1) {
		this.f1 = f1;
	}
	public void setF2(String f2) {
		this.f2 = f2;
	}
	public void setF3(String f3) {
		this.f3 = f3;
	}
	public void setF4(String f4) {
		this.f4 = f4;
	}
	@Value("prasad")
	private String f1;
	@Value("ratnapal")
	private String f2;
	@Value("rmesh")
	private String f3;
	@Value("ram")
	private String f4;
	@Override
	public String toString() {
		return "mayfriends [me=" + me + ", f1=" + f1 + ", f2=" + f2 + ", f3="
				+ f3 + ", f4=" + f4 + "]";
	}

}

