package com.ij.service;

import java.util.List;
import java.util.Map;

import com.ij.bo.Stbo;
import com.ij.dao.stdaoimpl;
import com.ij.dto.stdto;

public class stservice {
	//inject dao class here
	/**
	 * 
	 */
	private stdaoimpl stdao;

	public void setStdao(stdaoimpl stdao) {
		this.stdao = stdao;
	}
	public String enter(String name,int no,String adress)
	{
	
		
	int result=stdao.insert(name,no,adress);
		return "record is enterd succesfully";
	
		
	}
	public String del(String name){
		int result=stdao.delete(name);
		
		return "record is deleted"+name;
		
	}
	public Map<String, Object> byno(int no){
		Map<String, Object> result=stdao.show(no);
		return result;
	}
	public List<Map<String, Object>> all(){
		List<Map<String, Object>> result=stdao.showall();
		return result;
	}

}
