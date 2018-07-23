package com.ij;

import com.ij.os.android;
import com.ij.os.apple;
import com.ij.os.source;
import com.ij.os.windows;

public class factory {
	public source instance(String s){
		if(s.equals("andriod"))
			return new android();
		else if(s.equals("windows"))
		return new windows();
		else
			return new apple();
	}

}
