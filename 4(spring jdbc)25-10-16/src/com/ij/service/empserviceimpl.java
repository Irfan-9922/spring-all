package com.ij.service;

import java.util.ArrayList;
import java.util.List;

import com.ij.bo.EmpBo;
import com.ij.dao.daoimpl;
import com.ij.dto.empdto;

public class empserviceimpl implements empservice {
daoimpl dao;
	public void setDao(daoimpl dao) {
	this.dao = dao;
}

	@Override
	public empdto getbyNO(int empno) {
		EmpBo bo=dao.getbyno(empno);
		//convert bo to dto
		empdto dto=new empdto(bo.getEno(),bo.getEname(),bo.getJob(),bo.getSal());
		return dto;
		
	}

	@Override
	public List<empdto> getAll(String job) {
		// TODO Auto-generated method stub
		
		List<EmpBo>empbo=dao.getall(job);
//copy allrecord from bo to dto
		List<empdto>dto=new ArrayList<empdto>();
		for(EmpBo bo:empbo)
		{
			
			empdto edto=new empdto(bo.getEno(),bo.getEname(),bo.getJob(),bo.getSal());
			dto.add(edto);
		}
			if(dto!=null)
				return dto;
			else
				return null;
		
		
		
	}

}
