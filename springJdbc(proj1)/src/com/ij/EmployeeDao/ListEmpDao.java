package com.ij.EmployeeDao;

import java.util.List;

import com.ij.bo.employeeBo;

public interface ListEmpDao {
	public employeeBo getemloyeeDetailByname(int no);
	public List<employeeBo>getemployeeDetailByjob(String job);

}
