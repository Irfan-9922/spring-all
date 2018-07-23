package com.ij.dao;

import java.util.List;

import com.ij.bo.empBO;

public interface empDaoOpretion {
	public empBO getEmployeeByNumber(int no);
	public List<empBO> getEmployeeByDesignetion(String job);

}
