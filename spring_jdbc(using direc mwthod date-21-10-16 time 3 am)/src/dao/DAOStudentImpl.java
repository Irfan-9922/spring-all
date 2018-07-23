package dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class DAOStudentImpl implements DAOStudent {
	public static final String QUERY="insert into student111(name,fname,maname,job,sal)values(?,?,?,?,?)";
	public static final String gete="select name,fname,maname,job from student111 where sal=?";
	JdbcTemplate jt;
	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public int insert(String name, String fname, String maname, String job,
			int sal) {
		int cnt=jt.update(QUERY, name,fname,maname,job,sal);
		
		return cnt;
	}

	@Override
	public int getsal(int sal) {
		int cnt=jt.update(gete, sal);
		return cnt;
	}

}
