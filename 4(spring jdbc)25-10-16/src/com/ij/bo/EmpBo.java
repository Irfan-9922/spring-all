package com.ij.bo;

public class EmpBo {
	public int eno;
	public String ename;
	public String job;
	public int sal;
	
	public EmpBo(int eno, String ename, String job, int sal) {
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
		System.out.println("from empbo");
	}

}
