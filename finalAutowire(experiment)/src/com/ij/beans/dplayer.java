package com.ij.beans;

public class dplayer {
	private String name;
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	private String age;
	private String country;
	@Override
	public String toString() {
		return "dplayer [name=" + name + ", age=" + age + ", country="
				+ country + "]";
	}

}
