package com.ij.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ij.bo.empBO;

public class emprowmapper implements RowMapper {

	@Override
	public Object mapRow(ResultSet rs, int pos) throws SQLException {
		// TODO Auto-generated method stub
		//get record from result set and keep into a bo object
		empBO ebo=new empBO(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4));
		
		return ebo;
	}

}
