package com.ij.dao;

import java.util.List;

import com.ij.bo.studentbo;

public interface stdao {
	public studentbo getrecordbyno(int no);
	public List<studentbo> getrecordbyloc(String adress);

}
