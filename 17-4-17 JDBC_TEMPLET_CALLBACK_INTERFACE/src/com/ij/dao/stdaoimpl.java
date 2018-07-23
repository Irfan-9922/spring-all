package com.ij.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.ij.bo.studentbo;

public class stdaoimpl implements stdao{
	public static final String QUEYFORSINGLERECORD="select name,no,adress from student where no=?";
	 public static final String QUEYFORallRECORD="select name,no,adress from student where adress=?";
//inject templet class
private	JdbcTemplate jt;
	public void setJt(JdbcTemplate jt) {
	this.jt = jt;
}
	@Override
	public studentbo getstudentbyno(int no) {
		studentbo stbo=jt.queryForObject(QUEYFORSINGLERECORD, new Object[]{no}, new STrowmapper());
		
		return stbo;
	}
	private class STrowmapper implements RowMapper<studentbo>{

		@Override
		public studentbo mapRow(ResultSet rs, int arg1) throws SQLException {
			// TODO Auto-generated method stub
			studentbo bo=new studentbo(rs.getString(1), rs.getInt(2), rs.getString(3));
			return bo;
		}
	
	}
	@Override
	public List<studentbo> getallstudentbyadress(String adress) {
		List<studentbo> bo=jt.query(QUEYFORallRECORD, new Object[]{adress},new ResultSetExtractor<List<studentbo>>() {

			@Override
			public List<studentbo> extractData(ResultSet res) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				 //create one array list to hold all results from resultset
				List<studentbo> st=new ArrayList<>();
				//copy all result set data into bo object
				while(res.next()){
					//creat bo class object and itrat untill all the value come to bo 
					studentbo dd=new studentbo(res.getString(1), res.getInt(2), res.getString(3));
					//add all the all the result set object to list
					st.add(dd);
				}
				
				return st;
			}
	  
			
		});
		// TODO Auto-generated method stub
		return bo;
	}
	
	}

