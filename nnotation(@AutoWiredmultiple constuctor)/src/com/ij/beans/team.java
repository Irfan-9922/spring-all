package com.ij.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class team {
	private String team;

	private String countery;
	 




	public team(String team, String countery) {
		
		this.team = team;
		this.countery = countery;
	}



	public void setTeam(String team) {
		this.team = team;
	}



	public void setCountery(String countery) {
		this.countery = countery;
	}



	



	@Override
	public String toString() {
		return "team [team=" + team + ", countery=" + countery + "]";
	}



}
