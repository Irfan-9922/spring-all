package com.ij.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("s")
public class vichel {
	@Autowired(required=true)
	@Value("zingat")
	private String tname;

	@Override
	public String toString() {
		return "ter [tname=" + tname + "]";
	}

}
