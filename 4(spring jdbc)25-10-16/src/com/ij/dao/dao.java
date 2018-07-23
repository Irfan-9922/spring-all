package com.ij.dao;

import java.util.List;

import com.ij.bo.EmpBo;

public interface dao {
	public EmpBo getbyno(int empno);
	List<EmpBo>getall(String job);

}
