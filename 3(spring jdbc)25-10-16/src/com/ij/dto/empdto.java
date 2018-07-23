package com.ij.dto;

import java.io.Serializable;

public class empdto implements Serializable {
	public int eno;
	public String ename;
	public String job;
	public int sal;
	public empdto(int eno, String ename, String job, int sal) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.job = job;
		this.sal = sal;
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
		System.out.println("inside dto");
	}
	
	@Override
	public String toString() {
		return "empdto [eno=" + eno + ", ename=" + ename + ", job=" + job
				+ ", sal=" + sal + "]";
	}
	
	

}
