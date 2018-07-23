package com.ij.service;

import java.util.ArrayList;
import java.util.List;

import com.ij.bo.EmpBo;
import com.ij.dao.empDaoImpl;
import com.ij.dto.empdto;



public class empserviceimpl{
	empDaoImpl dao;

	public void setDao(empDaoImpl dao) {
		this.dao = dao;
		System.out.println("inside dao injection on serviced class");
	}
	
	public empdto getbyno(int no)
	{
		EmpBo eb=dao.getemployeebyno(no);
		//converting bo to dto
		System.out.println("inside service class");
		empdto d=new empdto(eb.getEno(),eb.getEname(),eb.getJob(),eb.getSal());
		if(d!=null)
		return d;
		else
			return null;
		
	}
	
	public List<empdto> serc(String job)
	{
		List<EmpBo>list=dao.getallemp(job);
		//convert bo to dto
		List<empdto>liste=new ArrayList<empdto>();
		for(EmpBo bo:list)
		{
			empdto b=new empdto(bo.getEno(),bo.getEname(),bo.getJob(),bo.getSal());
			liste.add(b);
		}
		if(liste!=null)
		return null;
		else
			return liste;
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

