package com.xworkz.DTO;

public class Customerdto {
	private int customerId;
	private String name="raja";//declaring and initialising we call it as literal
	//so using a literal we gave name
	private String email;
	private long contactNo;
	
	
	
	
	public Customerdto(){
		System.out.println("created customerdto with default constructor");
	}
	public int getCustomerId() {
		return customerId;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	
	

}
