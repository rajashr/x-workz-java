package com.xworkz.carshowroom.dto;

public class ManagerDTO {
	private String name;
	private long contactNo;
	
	public ManagerDTO() {
		super();
	}
	public ManagerDTO(String name, long contactNo) {
		super();
		System.out.println("manager degfault constructor");
		this.name = name;
		this.contactNo = contactNo;
	}
	
	

}
