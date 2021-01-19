package com.xworkz.DTO;

public class PlayerDTO2 {
	private String name;
	private String[] awards;
	private String countryName;
	private String[] sportsName;
	
	
	public PlayerDTO2() {
		System.out.println("created playerDTO2 using default constructor");
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String[] getAwards() {
		return awards;
	}


	public void setAwards(String[] awards) {
		this.awards = awards;
	}


	public String getCountryName() {
		return countryName;
	}


	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}


	public String[] getSportsName() {
		return sportsName;
	}


	public void setSportsName(String[] sportsName) {
		this.sportsName = sportsName;
	}

}
