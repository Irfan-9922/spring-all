package com.ij.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class empdaoimpl implements empdao {
public static 	final String INSERT_RECORD="INSERT INTO EMPLOYEE (NAME,AGE,JOB,SAL)VALUE(?,?,?,?)";


JdbcTemplate jt;

	public void setJt(JdbcTemplate jt) {
	this.jt = jt;
}

	@Override
	public int put(String name, int age, String job, int sal) {
		/*int cnt=jt.update(INSERT_RECORD,name,age,job,sal);
		
		return cnt;
	//	public int insert(int empno, String ename, String desg, int salary) {
			int cnt=jt.update(INSERT_RECORD,name,age,job,sal);
			return cnt;
		}*/
	}

}
