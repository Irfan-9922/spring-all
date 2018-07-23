package com.ij.beans;

public class mobile {
	//creatig the mobli field 
	//for bean stander wise we takent he class property as the private 
	
	private String brand;
	private String mname;
	private String prise;
	private String city;
	private int offer;
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public void setPrise(String prise) {
		this.prise = prise;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setOffer(int offer) {
		this.offer = offer;
	}
	@Override
	public String toString() {
		return "mobile [brand=" + brand + ", mname=" + mname + ", prise="
				+ prise + ", city=" + city + ", offer=" + offer + "]";
	}

}
