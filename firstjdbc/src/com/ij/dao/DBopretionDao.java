package com.ij.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class DBopretionDao implements DBopretions {
private static final String INSERT_QUERY="insert into emp(empno,ename ,job,sal)values(?,?,?,?)";
private JdbcTemplate jt;
	public void setJt(JdbcTemplate jt) {
	this.jt = jt;
}
	public int insert(int no, String name, String job, long sal) {
		int result=jt.update(INSERT_QUERY, no,name,job,sal);
		
		// TODO Auto-generated method stub
		return result;
	}

}
