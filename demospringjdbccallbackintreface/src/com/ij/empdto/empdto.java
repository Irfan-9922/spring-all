package com.ij.empdto;

public class empdto {

	public int no;
	
	public empdto(int no, String name, String job, int sal) {
		super();
		this.no = no;
		this.name = name;
		this.job = job;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "empdto [no=" + no + ", name=" + name + ", job=" + job + ", sal=" + sal + "]";
	}
	public String name;
	public String job;
	public int sal;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	}
}
