package com.ij.dao;

import java.util.List;

import com.ij.bo.EmpBo;

public interface DAOEmp {
	public EmpBo getemployeebyno(int eno);
	public List<EmpBo> getallemp(String job);

}
