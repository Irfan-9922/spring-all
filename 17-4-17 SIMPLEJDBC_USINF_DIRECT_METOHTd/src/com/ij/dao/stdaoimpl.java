package com.ij.dao;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

import com.ij.bo.Stbo;
import com.ij.dto.stdto;

public class stdaoimpl{
	//erite  the query for inserting record
	public static final String 	QUERY_FOR_INSERT_RECORD="insert into student(name,no,adress) values(?,?,?)";
	public static final String 	QUERY_FOR_delete_RECORD="delete from student where name=?";
	public static final String 	QUERY_FOR_getrecord_byno_RECORD="select name,adress from student where no=?";
	public static final String 	QUERY_FOR_getallRECORD="select name,no,adress from student";
	//inject jdbc templet herre
	private JdbcTemplate jt;

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	public int insert(String name,int no,String adress) {
		//use dto to converting and inserting
		
		int resu=jt.update(QUERY_FOR_INSERT_RECORD, name,no,adress);
		return resu;
	}
	public int delete(String name)
	{
		int result=jt.update(QUERY_FOR_delete_RECORD,name);
		return result;
	}
	public Map<String, Object> show(int no){
		Map<String, Object> result=jt.queryForMap(QUERY_FOR_getrecord_byno_RECORD,no);
		return result;
	}
	public List<Map<String, Object>> showall(){
		List<Map<String, Object>> result=jt.queryForList(QUERY_FOR_getallRECORD);
		return result;
	}
	

}
