package com.ij.dao;

import java.util.List;
import java.util.Map;

public interface dbOpretion {
	public  int insert(int no,String name,String job,double sal);
	public int get(int no);
	public Map<String,Object>listempdetail(int no);
	public List<Map<String,Object>>listallemp();
	public int delete(int no);
	

}
