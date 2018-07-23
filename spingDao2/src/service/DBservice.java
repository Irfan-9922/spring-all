package service;

import com.ij.dao.dbopretion;

public class DBservice {
	dbopretion dao;
	public void setDao(dbopretion dao) {
		this.dao = dao;
	}

public String register (String name,String lname,int no)

{
	int result=dao.insert(name, lname, no);
	if(result==0)
		return no+"record is not inserted";
	else
	{
		return no+"record is inserdet";
	}
	
}
}
