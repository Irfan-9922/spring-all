package com.ij.service;

import java.util.List;
import java.util.Map;

public interface empService {
	public  String put(int no,String name,String job,double sal);
	public int singlevale(int no);
	public Map<String,Object>singleRecord(int no) throws Exception;
	public List<Map<String,Object>>allemp() throws Exception;
	public String remove(int no);
	

}
