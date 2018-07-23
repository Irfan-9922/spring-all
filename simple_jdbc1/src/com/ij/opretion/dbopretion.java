package com.ij.opretion;

import java.util.List;
import java.util.Map;

public interface dbopretion {
	//get single result
	public int getsal(int no);
	//get single record
	public Map<String,Object>getrecord(int no);
	//get all record
	public List<Map<String,Object>>getallrecord();
	

}
