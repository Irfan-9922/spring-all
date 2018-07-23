package com.ij.service;

import java.util.ArrayList;
import java.util.List;

import com.ij.bo.EmpBo;
import com.ij.dao.Daoimpl;
import com.ij.dto.empdto;

public class empserviceimpl implements empservice {

Daoimpl dao;
	public void setDao(Daoimpl dao) {
	this.dao = dao;
}


	public empdto getbyno(int eno) {
		EmpBo ebo=dao.getbyno(eno);
		//converting emp bo to empdto
		empdto dto=new empdto(ebo.getEno(),ebo.getEname(),ebo.getJob(),ebo.getSal());
		
		
		return dto;
	}

	
	public List<empdto> getallbyjob(String job) {
		List<EmpBo> list=dao.getallemp(job);
		//converting all bo int o dto
		List<empdto>listdto=new ArrayList<empdto>();
		for(EmpBo bo:list){
			empdto dto=new empdto(bo.getEno(),bo.getEname(),bo.getJob(),bo.getSal());
			listdto.add(dto);
			
		}//for
		if(listdto!=null)
			return listdto;
		else
			return null;
	}

}
