package com.ij.dao;

import java.util.List;

import com.ij.bo.EmpBo;

public interface Dao {
	EmpBo getbyno(int eno);
	List<EmpBo>getallemp(String job);

}
