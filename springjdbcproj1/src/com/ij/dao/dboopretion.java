package com.ij.dao;

import java.util.List;
import java.util.Map;

public interface dboopretion {
	public int insert(int no,String name,String job,long sal);
	public int getSalary(int no);
	public Map<String ,Object> listmpdatil(int no);
	public List<Map<String,Object>>allempdetail();
	public int updateempsalery(int no,int newsal);
	public int deletemp(int no);

}
