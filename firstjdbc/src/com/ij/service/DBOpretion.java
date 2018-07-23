package com.ij.service;

import com.ij.dao.DBopretionDao;

public class DBOpretion {
	private DBopretionDao dao;
	
	public void setDao(DBopretionDao dao) {
		this.dao = dao;
	}

	

	public String registeremp(int no, String name, String job, int sal) {
		int result=dao.insert(no, name, job, sal);
		if(result==0)
			return no+"emp is not register";
		else
			return no+"emp is register";
	}

	/*public String registeremp(int no, String name, String job, int sal) {
		// TODO Auto-generated method stub
		return null;
	}*/

}
