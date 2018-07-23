package com.ij.emservice;

import java.util.ArrayList;
import java.util.List;

import com.ij.empbo.empbo;
import com.ij.empdao.empdaoimpl;
import com.ij.empdto.empdto;

public class empserviceimpl implements empservic {
//inject dao class here
	private empdaoimpl dao;
	public void setDao(empdaoimpl dao) {
		this.dao = dao;
	}

	@Override
	public empdto getbynum(int no) {
		// TODO Auto-generated method stub
		//here we convert bo into dto
		empbo ebo=dao.getbyno(no);
		//convert 
		empdto dto=new empdto(ebo.getNo(),ebo.getName(),ebo.getJob(),ebo.getSal());
		if(dto!=null)
		return dto;
		else
			return null;
	}

	@Override
	public List<empdto> getbyjob(String job) {
		// TODO Auto-generated method stub
		
		//use dao
		List<empbo> res=dao.getbyjob(job);
		//convert bo objrct int0o dto
		List<empdto> list=new ArrayList<empdto>();
		for(empbo bo:res)
		{
			empdto d=new empdto(bo.getNo(),bo.getName(),bo.getJob(),bo.getSal());
			list.add(d);
		}
		if(list!=null)
		return list;
		else
			return null;
	}



}
