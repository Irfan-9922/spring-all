package com.ij.factroy;

import com.ij.emptype.anaylises;
import com.ij.emptype.ceo;
import com.ij.emptype.hr;
import com.ij.emptype.manager;
import com.ij.emptype.programmer;
import com.ij.emptype.tester;
import com.ij.sal.sallery;

public class salleryfactory {
	public sallery getsallery(String s){
		if(s.equals("proggrammer"))
			return new programmer();
		else if(s.equals("manager"))
			return new manager();
		else if(s.equals("hr"))
			return new hr();
		else if(s.equals("anaaylises"))
			return new anaylises();
		else if(s.equals("ceo"))
			return new ceo();
		else 
			return new tester();
		
	}

}
