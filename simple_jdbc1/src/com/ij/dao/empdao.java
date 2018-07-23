package com.ij.dao;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

import com.ij.opretion.dbopretion;

public class empdao implements dbopretion {
	public static String Query1="select name from emp1 where sal=? ";
	public static String Query2="select name ,addre,loc,job,sal from emp1 where sal=? ";
	private JdbcTemplate jt;

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public int getsal(int no) {
		// TODO Auto-generated method stub
		/*  int salary=jt.queryForObject(Query1, Integer.class,no);
		   return salary;*/
		int sal=jt.queryForInt(Query1, no);
		return sal;
	}

	@Override
	public Map<String, Object> getrecord(int no) {
		Map<String,Object>result=jt.queryForMap(Query2,no);
		return result;
	}

	@Override
	public List<Map<String, Object>> getallrecord() {
		// TODO Auto-generated method stub
		return null;
	}

}
