package com.ij.factroy;

import com.ij.emptype.programmer;
import com.ij.emptype.tester;
import com.ij.sal.sallery;

public class mainfactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	salleryfactory fact=new salleryfactory();
	sallery sal=fact.getsallery("manager");
	sal.sal();
	sal=fact.getsallery("ceo");
	sal.sal();
	

	}

}
