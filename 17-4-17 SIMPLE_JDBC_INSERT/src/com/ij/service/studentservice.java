package com.ij.service;

import com.ij.bo.studentbo;
import com.ij.dao.studentdao;
import com.ij.dto.studentdto;

public class studentservice {
	private studentdao dao;

	public void setDao(studentdao dao) {
		this.dao = dao;
	}
	/*public String register(String name,String no,String adress){
		//use vo 
		studentvo vo=new studentvo(name, no, adress);
		studentbo bo=new studentbo();
		bo.setName(vo.getName());
		bo.setNo(Integer.parseInt(vo.getNo()));
		bo.setAdress(vo.getAdress());
		int result=dao.insert(bo);
		if(result==0)
			return "record is not inserted";
		else
			return"ok";
		
		
	}
*/
	public String register(studentdto dt)
	{
		//use dto object that containing the user input values
		studentdto dto=new studentdto();
		studentbo bo=new studentbo();
		bo.setName(dto.getName());
		bo.setNo(dto.getNo());
		bo.setAdress(dto.getAdress());
		if(bo!=null)
			return "register";
		else
			return"not";
		
		
		
		
	}
}
