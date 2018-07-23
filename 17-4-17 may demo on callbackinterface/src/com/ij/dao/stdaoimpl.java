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
import org.springframework.jdbc.core.RowMapper;

import com.ij.bo.studentbo;

public class stdaoimpl implements stdao {
	// write a query
	private static final String QUREY_FOR_SINGLE_RECORD = "select name,no,adress from student where no=:sno";
	private static final String QUREY_FOR_ALL_RECORD = "select name,no,adress from student where adress=?";
	// inject jdbc templet class into it
	private JdbcTemplate jt;

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public studentbo getrecordbyno(int no) {
		//prepare for param values
		Map<String,Object> map=new HashMap<>();
		map.put("sno", no);
		studentbo bo = jt.queryForObject(QUREY_FOR_SINGLE_RECORD, new Object[] { no }, new RowMapper<studentbo>() {

			@Override
			public studentbo mapRow(ResultSet res, int arg1) throws SQLException {
				// TODO Auto-generated method stub
				// use bo class object to copy all result set objec into b class
				studentbo b = new studentbo(res.getString(1), res.getInt(2), res.getString(3));
				return b;
			}
		});
		// TODO Auto-generated method stub
		return bo;
	}

	@Override
	public List<studentbo> getrecordbyloc(String adress) {
		List<studentbo> bo=jt.query(QUREY_FOR_ALL_RECORD, new Object[]{adress},new ResultSetExtractor<List<studentbo>>() {

			@Override
			public List<studentbo> extractData(ResultSet res) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				List<studentbo>st=new ArrayList<studentbo>();
				//iterate all the object bo class object
				while(res.next()){
					//here i creat the student bo object that can take or all object can copy into bo bo object
				      studentbo v=new studentbo(res.getString(1), res.getInt(2), res.getString(3));
				      //here i am adding all the object into list
				      st.add(v);
				}
				//here i am returnong the list object
				return st;
			}
			//create array list to hold all the record from result set
		
			
			
		});
		//here i am returning the bo object that allready hold allresult set data
		
		return bo;
	}

}
