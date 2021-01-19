package com.xworkz.carshowroom.showroom.DTO;

public class ManagerDTO {
	//what properties a manager can have
	private String name;
	private long contactNo;
	
	//lets initialise these  properties using constructor
	
	public ManagerDTO() {
		System.out.println("default constructor");
	}
	public ManagerDTO(String name,long contactNo) {
		System.out.println("parameterised constructor");
		this.name=name;
		this.contactNo=contactNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

}
