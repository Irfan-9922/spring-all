package com.ij.beans;

public class dteam {
	private String cricket;
	private String football;
	private String badminton;
	private String hockey;
	public void setCricket(String cricket) {
		this.cricket = cricket;
	}
	public void setFootball(String football) {
		this.football = football;
	}
	public void setBadminton(String badminton) {
		this.badminton = badminton;
	}
	public void setHockey(String hockey) {
		this.hockey = hockey;
	}
	@Override
	public String toString() {
		return "dteam [cricket=" + cricket + ", football=" + football
				+ ", badminton=" + badminton + ", hockey=" + hockey + "]";
	}

}
