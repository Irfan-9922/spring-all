package com.ij.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;

import com.ij.bo.empBO;

public class empDaoOpretionimpl implements empDaoOpretion {
	private static final String QUERY_FOR_SINGLE_RECORD="select no,name,job,sal from imp where no=:eno";
	private static final String QUERY_FOR_MULTIPLE_RECORD="select no,name,job,sal from imp where job=:ejob";
private JdbcTemplate jt;
	public void setJt(JdbcTemplate jt) {
	this.jt = jt;
}

	@Override
	public empBO getEmployeeByNumber(int no) {
		//using named parameter jdbc templet
		//using hash map
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("eno", no);
		// TODO Auto-generated method stub
		empBO emp=(empBO) jt.queryForObject(QUERY_FOR_SINGLE_RECORD, new Object[]{no},new emprowmapper());
		return emp;
	}

	@Override
	public List<empBO> getEmployeeByDesignetion(String job) {
		//MapSqlParameterSource p=new
		// TODO Auto-generated method stub
		MapSqlParameterSource param=new MapSqlParameterSource();
		param.addValue("ejob", job);
		List<empBO> result=jt.query(QUERY_FOR_MULTIPLE_RECORD, new Object[]{job},new ResultSetExtractor<List<empBO>>()
		
		
		{

			@Override
			public List<empBO> extractData(ResultSet res) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				System.out.println("extract data");
				//first you have to create the arry list to hold the record
				List<empBO> list=new ArrayList<empBO>();
				while(res.next())
				{
					empBO ebo=new empBO(res.getInt(1),res.getString(2),res.getString(3),res.getInt(4));
			list.add(ebo);
				}//end of while
				return list;
			}//end of extract data
		});
		return result;
	}

}
