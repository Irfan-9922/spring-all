package com.ij.dao;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class DBopretionDAO implements dboopretion {
public static final String INSERT_QRY="insert into emp(no,name,sal,job)values(?,?,?,?)";
public static final String GET_EMP_SAL="select sal from emp where empno=?";
public static final String GET_EMP_DETAIL_BY_SAL="select empno,name,sal,job from emp where empno=?";
public JdbcTemplate jt;
	public void setJt(JdbcTemplate jt) {
	this.jt = jt;
}

	@Override
	public int insert(int no, String name, String job, long sal) {
		// TODO Auto-generated method stub
		//return the qurey
		int result=jt.update(INSERT_QRY,no,name,job,sal);
		
		return result;
	}

	@Override
	public int getSalary(int no) {
	int result=jt.update(GET_EMP_SAL, no);
	}

	@Override
	public Map<String, Object> listmpdatil(int no) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> allempdetail() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateempsalery(int no, int newsal) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deletemp(int no) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
