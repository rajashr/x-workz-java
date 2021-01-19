package com.xworkz.DTO;

public class Playerdto {
	//data transfer object we make sure we write only fields means we 
	//store only data in tis class
	
	private String name;
	private String[] sportsName= {"VolleyBall","ThrowBall","Cricket","Hockey","BasketBall"};
	private String countryName;
	private String[] awards= {"State level","natinal level","international level","School level"};
	
	
	
	public Playerdto() {
		System.out.println("created playerdto using a default constructor");
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
		this.name=name;
		
	}
	public void setSportsName(String[] sportsName) {
		this.sportsName=sportsName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public void setAwards(String[] awards) {
		this.awards = awards;
	}
	

}
