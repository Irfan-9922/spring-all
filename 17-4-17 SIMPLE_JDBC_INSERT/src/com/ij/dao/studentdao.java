package com.ij.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import com.ij.bo.studentbo;

public class studentdao {
	//use simple jdbc insert
	//this class i am using b's it is thread safe and nad fast as compare to jdbc templet and named parameter jdbc templet
	private SimpleJdbcInsert jit;

	public void setJit(SimpleJdbcInsert jit) {
		this.jit = jit;
	}
	public int insert(studentbo bo){
		//prepare param for exicute 
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("name", bo.getName());
		map.put("no", bo.getNo());
		map.put("adress", bo.getAdress());
		//specify the table name
		jit.setTableName("student");
		 int res=jit.execute(map);
		return res;
		
	}
	

}
