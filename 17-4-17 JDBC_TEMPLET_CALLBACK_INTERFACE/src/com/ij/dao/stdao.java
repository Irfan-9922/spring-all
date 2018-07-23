package com.ij.dao;

import java.util.List;

import com.ij.bo.studentbo;

public interface stdao {
	public  studentbo getstudentbyno(int no);
	public List<studentbo>getallstudentbyadress(String adress);

}
