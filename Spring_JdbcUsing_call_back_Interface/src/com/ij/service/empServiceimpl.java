package com.ij.service;

import java.util.ArrayList;
import java.util.List;

import com.ij.bo.empBO;
import com.ij.dao.empDaoOpretionimpl;
import com.ij.dto.empDto;

public class empServiceimpl implements empService{
 public void setEmpdao(empDaoOpretionimpl empdao) {
		this.empdao = empdao;
	}

private empDaoOpretionimpl empdao;
 
	@Override
	public empDto getbyno(int no) {
		// TODO Auto-generated method stub
		empBO ebo=empdao.getEmployeeByNumber(no);
		//converting bo object into dto
		empDto dto=new empDto(ebo.getNo(),ebo.getName(),ebo.getJob(),ebo.getSal());
		if(dto!=null)
		return dto;
		else return null;
	}

	@Override
	public List<empDto> getbyjob(String job) {
		// TODO Auto-generated method stub
		List<empBO> result=empdao.getEmployeeByDesignetion(job);
		//converting bo to dto
		List<empDto> dto=new ArrayList<empDto>();
		for(empBO bo:result)
		{
			empDto empdto=new empDto(bo.getNo(),bo.getName(),bo.getJob(),bo.getSal());
			dto.add(empdto);
		}
		if(dto!=null)
		return dto;
		else
			return null;
	}

}
