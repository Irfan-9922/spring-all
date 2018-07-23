package com.ij.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class dcountery {

	private String cname;
	
	public void setCname(String cname) {
		this.cname = cname;
	}
	public void setCsport(String csport) {
		this.csport = csport;
	}
	private String csport;
	@Override
	public String toString() {
		return "dcountery [cname=" + cname + ", csport=" + csport + "]";
	}

}
