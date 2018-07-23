package service;

import java.util.Map;

import com.ij.dao.empdao;

public class empservice {
	private empdao dao;

	public void setDao(empdao dao) {
		this.dao = dao;
	}
public int getsinglevalue(int no)
{
	int result=dao.getsal(no);
	return result;
}
public Map<String,Object>singlerecord(int no)
{
	Map<String,Object>result=dao.getrecord(no);
	return result;
	
}
	
}
