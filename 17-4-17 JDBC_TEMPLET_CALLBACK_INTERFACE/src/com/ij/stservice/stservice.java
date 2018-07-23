package com.ij.stservice;

import java.util.ArrayList;
import java.util.List;

import com.ij.bo.studentbo;
import com.ij.dao.stdaoimpl;
import com.ij.dto.stdto;

public class stservice {
	private stdaoimpl stdao;

	public void setStdao(stdaoimpl stdao) {
		this.stdao = stdao;
	}

	
	public stdto getbystdtono(int no){
		
		//converting bo object to dao object
		studentbo stbo=stdao.getstudentbyno(no);
		//convert bo into dto
		stdto dto=new stdto(stbo.getName(),stbo.getNo(),stbo.getAdress());
		return dto;
		
	}

	public List<stdto> getbyaddress(String adress){
		//use dao to call dao method
		List<studentbo> bo=stdao.getallstudentbyadress(adress);
		//copy all bo class object to dto
		List<stdto> std=new ArrayList<>();
		//use foreach loop
		for(studentbo bb:bo){
			//create dto object
			stdto dt=new stdto(bb.getName(), bb.getNo(), bb.getAdress());
			//add to list
			std.add(dt);
		}
		return std;
		
	}
	
}
