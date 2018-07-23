package com.ij.service;

import java.util.List;

import com.ij.dto.empDto;

public interface empService {
	public empDto getbyno(int no);
	public  List<empDto> getbyjob(String job);

}
