package com.ij.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class DBopretionimpl implements dbopretion {
	
	public static final String INSERT="insert into studebtdb(name,lname,no)values(?,?,?)";
			
JdbcTemplate jt;
	public void setJt(JdbcTemplate jt) {
	this.jt = jt;
}
	@Override
	public int insert(String name, String lname, int no) {
	//int cnt=jt.update(INSERT, name,lname,no);
	int ct=jt.update(INSERT,name,lname,no);
//	int cntt=jt.update(INSERT);
		return ct;
	}

}
