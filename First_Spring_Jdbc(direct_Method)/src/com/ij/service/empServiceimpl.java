package com.ij.service;

import java.util.List;
import java.util.Map;

import com.ij.dao.dbOpretionimpl;

public class empServiceimpl implements empService{
//inject a dao class in service class
	private dbOpretionimpl db;
	
	public void setDb(dbOpretionimpl db) {
		this.db = db;
	}

	@Override
	public String put(int no, String name, String job, double sal) {
		// TODO Auto-generated method stub
		int result=db.insert(no, name, job, sal);
		if(result==0)
		return no+"emp is not registerd";
		else
			return no+"emp is registerd";
		
	}

	@Override
	public int singlevale(int no) {
		// TODO Auto-generated method stub
		int result=db.get(no);
		return result;
	}

	@Override
	public Map<String, Object> singleRecord(int no) throws Exception {
		// TODO Auto-generated method stub
		 Map<String, Object>  result=db.listempdetail(no);
		 if(result!=null)
			 
		return result;
		 else
			 throw new Exception(no+"emp not found");
	}

	@Override
	public List<Map<String, Object>> allemp() throws Exception {
		// TODO Auto-generated method stub
		 List<Map<String, Object>> result=db.listallemp();
		 if(result!=null)
			 
				return result;
				 else
					 throw new Exception("record  not found");

	}

	@Override
	public String remove(int no) {
		// TODO Auto-generated method stub
		int result=db.delete(no);
		if(result==0)
			return no+"not found";
		else
		return no+"is deleted";
	}

}
