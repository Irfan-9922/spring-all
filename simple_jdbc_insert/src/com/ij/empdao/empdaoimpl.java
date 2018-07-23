package com.ij.empdao;

import java.util.HashMap;
import java.util.Map;
import com.ij.empbo.*;

import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import com.ij.empbo.empbo;

public class empdaoimpl implements empdao {
	//
	private SimpleJdbcInsert sijt;

	public void setSijt(SimpleJdbcInsert sijt) {
		this.sijt = sijt;
	}

	@Override
	public int insert(empbo ebo) {
		System.out.println("fitfth");
		Map<String,Object>map=new HashMap<String,Object>();
		map.put("no", ebo.getNo());
		map.put("name", ebo.getJob());
		map.put("job", ebo.getJob());
		map.put("sal", ebo.getSal());
		sijt.setTableName("imp");
		int result=sijt.execute(map);
		// TODO Auto-generated method stub
		return result;
	}

	
	

}
