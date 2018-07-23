package com.ij.emservice;

import java.util.List;

import com.ij.empdto.empdto;

public interface empservic {
	public empdto getbynum(int no);
	public List<empdto> getbyjob(String job);

}
