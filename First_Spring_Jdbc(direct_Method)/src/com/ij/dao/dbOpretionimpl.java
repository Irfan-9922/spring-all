package com.ij.dao;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class dbOpretionimpl implements dbOpretion{
	public static final String QUERY_FOR_INSERT="insert into imp values(?,?,?,?)";
	public static final String QUERY_FOR_GET_SINGLE_FIELD="select name from imp where no=?";
	public static final String QUERY_FOR_GET_SINGLE_EMP_RECORD="select no,name,job,sal from imp where  no=?";
	public static final String QUERY_FOR_GET_ALL_RECORD="select no,name,job,sal from imp";
	public static final String QUERY_FOR_DELETE="delete from imp where no=?";
	//inject a jdbc templet into dao class
	private JdbcTemplate jt;
	

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public int insert(int no, String name, String job, double sal) {
		int result=jt.update(QUERY_FOR_INSERT,no,name,job,sal);
		return result;
	}

	@Override
	public int get(int no) {
		// TODO Auto-generated method stub
		int result=jt.update(QUERY_FOR_GET_SINGLE_FIELD,no);
		return result;
	}

	@Override
	public Map<String, Object> listempdetail(int no) {
		// TODO Auto-generated method stub
		Map<String,Object> map=jt.queryForMap(QUERY_FOR_GET_SINGLE_EMP_RECORD,no);
		return map;
	}

	@Override
	public List<Map<String, Object>> listallemp() {
		// TODO Auto-generated method stub
		 List<Map<String, Object>> list=jt.queryForList(QUERY_FOR_GET_ALL_RECORD);
		return list;
	}

	@Override
	public int delete(int no) {
		// TODO Auto-generated method stub
		int result=jt.update(QUERY_FOR_DELETE,no);
		return result;
	}

}
