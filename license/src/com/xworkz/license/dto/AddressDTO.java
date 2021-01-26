package com.xworkz.license.dto;

public class AddressDTO {
	private String state;
	private String city;
	private String area;
	private int pincode;
	private String buildingName;
	private String street;
	private int doorNo;
	
	
	public AddressDTO() {
		super();
	}
	
	public AddressDTO(String state, String city, String area, int pincode, String buildingName, String street,
			int doorNo) {
		super();
		this.state = state;
		this.city = city;
		this.area = area;
		this.pincode = pincode;
		this.buildingName = buildingName;
		this.street = street;
		this.doorNo = doorNo;
	}
	
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getBuildingName() {
		return buildingName;
	}
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}
	
	
	

}
