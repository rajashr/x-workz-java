package com.xworkz.DTO;

public class PlayerDTO1 {
	private String name;
	private String[] sportsName;
	private String countryName;
	private String[] awards;
	
	public PlayerDTO1(){
		System.out.println("created playerDTO1 using default constructor");
	}

	public String getName() {
		return name;
	}

	public String[] getSportsName() {
		return sportsName;
	}

	public String getCountryName() {
		return countryName;
	}

	public String[] getAwards() {
		return awards;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSportsName(String[] sportsName) {
		this.sportsName = sportsName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public void setAwards(String[] awards) {
		this.awards = awards;
	}

}
