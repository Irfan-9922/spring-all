package com.ij.beans;

public class testTeam {
	private String Assesh;
	public testTeam(String assesh, String team, String location) {
		
		Assesh = assesh;
		this.team = team;
		this.location = location;
	}
	private String team;
	private String location;
	public testTeam(String oditeam) {
		super();
		this.oditeam = oditeam;
	}
	private String oditeam;

}
