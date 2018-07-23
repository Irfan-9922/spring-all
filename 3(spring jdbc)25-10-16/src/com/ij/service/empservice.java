package com.ij.service;

import java.util.List;

import com.ij.dto.empdto;

public interface empservice {
	public empdto getbyno(int eno);
	public List <empdto>getallbyjob(String job);

}
