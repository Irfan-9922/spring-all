package com.ij.EmployeeDao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.ij.bo.employeeBo;

public class empDaoimpl implements ListEmpDao {

	private static final String GET_EMP_DETAILS_BY_No="select empno,ename,job,sal from emp where empno=?";
	private static final String GET_EMP_DETAILS_BY_JOB="select empno,ename,job,sal from emp where job=?"; 
private JdbcTemplate jt;
	
	public void setJt(JdbcTemplate jt) {
	this.jt = jt;
}


	public employeeBo getemloyeeDetailByname(int no) {
		employeeBo empbo=jt.queryForObject(GET_EMP_DETAILS_BY_No, new Object[]{eno}, new EmpRowMapper());
		
		return empbo;
	}
public class EmpRowMapper implements RowMapper<employeeBo>{

	@Override
	public employeeBo mapRow(ResultSet rs, int nos) throws SQLException {
		// TODO Auto-generated method stub
		System.out.println("row mapper");
		//kekep the record in result set object
		employeeBo ebo=new employeeBo(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4));
		
		return ebo;
	}
	
}
	
	public List<employeeBo> getemployeeDetailByjob(String job) {
		List<employeeBo>list=jt.query(GET_EMP_DETAILS_BY_JOB, new Object[]{job}, new ResultSetExtractor<list<employeeBo>>(){
			public List<employeeBo>extractData(ResultSet rs)
			throws SQLException,DataAccessException{
				system.out.println("extract data");
				List<employeeBo>list=new ArrayList<employeeBo>();
				while(rs.next())
				{
					employeeBo ebo=new employeeBo(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4));
					list.add(ebo);
					
			
				}//while
				return list;
			}
		}
		);
		// TODO Auto-generated method stub
	
	}

	

	
}
