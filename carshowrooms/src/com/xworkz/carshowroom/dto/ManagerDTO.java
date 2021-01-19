package com.xworkz.carshowroom.dto;

public class ManagerDTO {
 //details a manager could have
	private String name;
	private long contactNo;
	
	
	public ManagerDTO() {
		System.out.println("created managerDTO using default constructor");
	}
	
	public ManagerDTO(String name,long contactNo) {
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
	
	
	
	//we can use constructors or set and get method
	

}
