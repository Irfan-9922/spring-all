package com.ij.empdao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ij.empbo.empbo;

public class emprowmapper implements RowMapper {

	@Override
	public Object mapRow(ResultSet rs	, int pos) throws SQLException {
		// TODO Auto-generated method stub
		empbo ebo=new empbo(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4));
		return ebo;
	}

}
