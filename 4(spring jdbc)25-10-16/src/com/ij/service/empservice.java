package com.ij.service;

import java.util.List;

import com.ij.bo.EmpBo;
import com.ij.dto.empdto;

public interface empservice {
	empdto getbyNO(int empno);
	List<empdto> getAll(String job);

}
