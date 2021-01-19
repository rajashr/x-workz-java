package com.xworkz.carshowroom.DTO;

public class ManagerDTO {
	/*details of manager
	 * 
	 */
     
	private String name;
	private long contactNo;
	
	
	public  ManagerDTO() {
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
