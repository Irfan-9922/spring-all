package com.ij.empdao;

import java.util.List;

import com.ij.empbo.empbo;

public interface empdao {
	//for single record
	public empbo getbyno(int no);
public List<empbo>getbyjob(String job);

}
