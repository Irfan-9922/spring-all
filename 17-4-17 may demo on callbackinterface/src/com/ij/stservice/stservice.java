package com.ij.stservice;

import java.util.ArrayList;
import java.util.List;

import com.ij.bo.studentbo;
import com.ij.dao.stdaoimpl;
import com.ij.dto.stdto;

public class stservice {
	//inject dao class
	private stdaoimpl dao;

	public void setDao(stdaoimpl dao) {
		this.dao = dao;
	}

	public stdto getbyno(int no){
		
		//use dao to copy bo object into dto
		studentbo b=dao.getrecordbyno(no);
		//copy all object bo into dto
		stdto d=new stdto(b.getName(),b.getNo(),b.getAdress());
		if(d!=null)
		return d;
		else
			return null;
		
	}
	
	public List<stdto> getrecordbyad(String adress){
		//ia m calling bo class object here that already holding resultset data
		List<studentbo> bo=dao.getrecordbyloc(adress);
		//here i am 'coping all bo object into dto because flow is going like
		//clint req(add)-->service-->bo-->dao
		//resp-->bo-->service-->dto-->client
		//this chain will follow
		List<stdto> list=new ArrayList<stdto>();
		//use for loop
		for(studentbo bb:bo){
			stdto d=new stdto(bb.getName(), bb.getNo(), bb.getAdress());
			//here i am adding into tj=he list
			list.add(d);
		}
		return list;
		
	}
}
