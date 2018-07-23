package com.ij.service;

import dao.DAOStudentImpl;

public class Student_Service_imp implements Student_Service {

	DAOStudentImpl dao;
	public void setDao(DAOStudentImpl dao) {
		this.dao = dao;
	}
	@Override
	public int insert_Rcord(String name, String fname, String maname,
			String job, int sal) {
		int cmt=dao.insert(name, fname, maname, job, sal);
		if(cmt<=0)
		{
			System.out.println("record is not inserted");
			return 0;
		}
		else
		{
			System.out.println("record is inserted");
			return cmt;
			
		}

	}
	@Override
	public int getrecordbysal(int sal) {
		int cnt=dao.getsal(sal);
		return sal;
	}

	/*public int insert_Rcord(String name, String fname, String mname,
			String job, int sal) {
		int cmt=dao.insert(name, fname, mname, job, sal);
		if(cmt<=0)
		{
			System.out.println("record is not inserted");
			return 0;
		}
		else
		{
			System.out.println("record is inserted");
			return cmt;
			
		}


*/
}
