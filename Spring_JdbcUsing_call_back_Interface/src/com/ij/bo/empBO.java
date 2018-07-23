package com.ij.bo;

public class empBO {
	private int no;
	private String name;
	private String job;
	private double sal;
	public int getNo() {
		return no;
	}
	public empBO(int no, String name, String job, double sal) {
		super();
		this.no = no;
		this.name = name;
		this.job = job;
		this.sal = sal;
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