package com.ij.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.ij.bo.EmpBo;

public class empDaoImpl implements DAOEmp {
	public static final String QUERY_FOR_GETEMP_BY_Job="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE JOB=?";
	public static final String QUERY_FOR_GETEMP_BY_NO="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE EMPNO=?";
JdbcTemplate jt;
public void setJt(JdbcTemplate jt) {
	this.jt = jt;
}
@Override
public EmpBo getemployeebyno(int eno) {
	EmpBo bo=jt.queryForObject(QUERY_FOR_GETEMP_BY_NO, new Object[]{eno}, new empe());
	return bo;
}
public class empe implements RowMapper<EmpBo>
{

	@Override
	public EmpBo mapRow(ResultSet res	, int cnt) throws SQLException {
		// TODO Auto-generated method stub
		EmpBo en=new EmpBo(res.getInt(1),res.getString(2),res.getString(3),res.getInt(4));
		
		return en;
	}
	
}

public List<EmpBo> getallemp(String job) {
	List<EmpBo> list=jt.query(QUERY_FOR_GETEMP_BY_Job, new Object[]{job}, new ResultSetExtractor<List<EmpBo>>(){
			public List<EmpBo>extractData(ResultSet rs) throws SQLException{
			List<EmpBo> list=new ArrayList<EmpBo>();
	while (rs.next()){
		EmpBo en=new EmpBo(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4));
		list.add(en);
	}
	return list;	
}

}		
			);
	
	return list;
	
}

	
}//outer class
