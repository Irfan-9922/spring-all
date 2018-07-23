package com.ij.empdto;

import java.io.Serializable;

public class empdto  implements Serializable {
	private int no;
	private String name;
	public empdto(int no, String name, String job, double sal) {
		super();
		this.no = no;
		this.name = name;
		this.job = job;
		this.sal = sal;
		System.out.println("1 dto");
	}
	
	@Override
	public String toString() {
		return "empdto [no=" + no + ", name=" + name + ", job=" + job + ", sal=" + sal + "]";
	}

	private String job;
	private double sal;
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
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}

}
