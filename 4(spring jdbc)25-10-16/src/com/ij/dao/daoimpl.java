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

public class daoimpl implements dao {
String query="select empno,ename,job,sal from emp where empno=?";
String allrecord="select empno,ename,job,sal from emp where job=?";
JdbcTemplate jt;
	public void setJt(JdbcTemplate jt) {
	this.jt = jt;
}

	public EmpBo getbyno(int empno) {
		EmpBo bo=jt.queryForObject(query, new Object[]{empno}, new rowmapper());
		return bo;
	}
	public class rowmapper implements RowMapper<EmpBo>
	{

		@Override
		public EmpBo mapRow(ResultSet res, int pos) throws SQLException {
			// TODO Auto-generated method stub
			//pass resultset record into bo class
			EmpBo bo=new EmpBo(res.getInt(1),res.getString(2),res.getString(3),res.getInt(4));
			return bo;
		}//row mapper
		
	}//inner class

	public List<EmpBo> getall(String job) {
		List<EmpBo>list= jt.query(allrecord, new Object[]{job}, new ResultSetExtractor<List<EmpBo>>()
				{
			public List<EmpBo>extractData(ResultSet rs) throws SQLException,DataAccessException
			{
			List<EmpBo>lis=new ArrayList<EmpBo>();
			//transfor result set into bo 
			while(rs.next()){
			EmpBo bo=new EmpBo(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4));
			//return bo;
			lis.add(bo);
			}//while
			return lis;
			}//
			
	}
				
				);
				
	return list;
				
	}

}
