package com.ij.empservice;

import com.ij.empbo.empbo;
import com.ij.empdao.empdaoimpl;
import com.ij.empdto.empdto;

public class empserviceimpl implements empservice {
	//inject the dao class here
	private empdaoimpl empdao;

	public void setEmpdao(empdaoimpl empdao) {
		this.empdao = empdao;
	}

	@Override
	public int insert(empdto dto) {
		// TODO Auto-generated method stub
		//use bo
		empbo ebo=new empbo(dto.getNo(), dto.getName(),dto.getJob(),dto.getSal());
		int result=empdao.insert(ebo);
		return result;
	}


	/*public int insert(int no, String name, String job, int sal) {
		// TODO Auto-generated method stub
		//prepare for dto
		System.out.println("first");
		empdto dto=new empdto(no, name, job, sal);
		//prepare for bo and convert into bo object
		System.out.println("second");
		empbo ebo=new empbo(dto.getNo(), dto.getName(), dto.getJob(), dto.getSal());
		System.out.println("third");
		int result=empdao.insert(ebo);
		System.out.println("fourth");
		return result;
	}
*/
}
