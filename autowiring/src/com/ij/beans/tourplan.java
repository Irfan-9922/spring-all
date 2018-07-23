package com.ij.beans;

import java.util.Arrays;

public class tourplan {
	private String[] places;

	public void setPlaces(String[] places) {
		this.places = places;
	}

	@Override
	public String toString() {
		return "tourplan [places=" + Arrays.toString(places) + "]";
	}
	

}
