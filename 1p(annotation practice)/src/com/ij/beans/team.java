package com.ij.beans;

import org.springframework.beans.factory.annotation.Required;

public class team {
 private String team;
 private String countery;
 private String coch;
 private String captain;
 
public void setTeam(String team) {
	this.team = team;
}
public void setCountery(String countery) {
	this.countery = countery;
}
 
public void setCoch(String coch) {
	this.coch = coch;
}
public void setCaptain(String captain) {
	this.captain = captain;
}
@Override
public String toString() {
	return "team [team=" + team + ", countery=" + countery + ", coch=" + coch
			+ ", captain=" + captain + "]";
}
 

}
