package com.ij.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.ij.bo.EmpBo;

public class Daoimpl implements Dao {
public String Query="select empno,ename,job,sal from emp where empno=?";
public String query="select empno,ename,job,sal from emp where job=?";
	//injecting spring jdbc templet
JdbcTemplate jt;
	public void setJt(JdbcTemplate jt) {
	this.jt = jt;
}


	public EmpBo getbyno(int eno) {
		//using call back intrface
		EmpBo bo=jt.queryForObject(Query, new Object[]{eno}, new rowmapper());
		return bo;
	}
 public class rowmapper implements RowMapper<EmpBo>{

	@Override
	public EmpBo mapRow(ResultSet rs, int pos) throws SQLException {
		//transforing from result set into bo
		EmpBo bo=new EmpBo(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4));
		return bo;
	}//map rew
 }//inner class
	
	public List<EmpBo> getallemp(String job) {
		
		List<EmpBo>list= jt.query(query, new Object[]{job}, new ResultSetExtractor<List<EmpBo>>()
		{
			@Override
			public List<EmpBo> extractData(ResultSet rs) throws SQLException,
					DataAccessException {
				List<EmpBo>lis=new ArrayList();
				while(rs.next())
				{
					//get record from result set into bo 
					EmpBo bo=new EmpBo(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4));
					lis.add(bo);
			}//while
				return lis;
		
				
		}//exteract data
		}//anyanomus inner class	
				);
		
		
		
	return list;
	}//method 

}//class
