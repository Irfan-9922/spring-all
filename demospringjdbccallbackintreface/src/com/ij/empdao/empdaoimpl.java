package com.ij.empdao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.ij.empbo.empbo;
//inject the jdbc templet class
 
public class empdaoimpl implements empdao{
public String QUERY_FOR_SINGLE_RECORD="select no,name,job,sal from imp where no=?";
	
public String QUERY_FOR_MULTIPLE_RECORD="select no,name,job,sal from imp where job=?";
public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	private JdbcTemplate jt;



	@Override
	public empbo getbyno(int no) {
		// TODO Auto-generated method stub
		empbo ebo=(empbo) jt.queryForObject(QUERY_FOR_SINGLE_RECORD, new Object[]{no},new emprowmapper());
		
		return ebo;
	}

	@Override
	public List<empbo> getbyjob(String job) {
		// TODO Auto-generated method stub
		List<empbo> result=jt.query(QUERY_FOR_MULTIPLE_RECORD, new Object[]{job},new ResultSetExtractor<List<empbo>>() {

			@Override
			public List<empbo> extractData(ResultSet res) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				List<empbo> list=new ArrayList<empbo>();
				while(res.next())
				{
					empbo bo=new empbo(res.getInt(1),res.getString(2),res.getString(3),res.getInt(4));
			list.add(bo);
				}
				return list;
			}
		});
		return result;
	}

}
