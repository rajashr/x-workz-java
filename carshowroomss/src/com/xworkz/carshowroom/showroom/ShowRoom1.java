package com.xworkz.carshowroom.showroom;

import com.xworkz.carshowroom.DTO.ManagerDTO;

public class ShowRoom1 {
	private String name;
	private String location;
	private ManagerDTO manager;
	
	public ShowRoom1() {
		System.out.println("created showroom using default constructor");
	}
	
	
	public ShowRoom1(String name, String location, ManagerDTO manager) {
		super();
		this.name = name;
		this.location = location;
		this.manager = manager;
	}
	
	public void addManager(ManagerDTO dto) {
		System.out.println("adding manager by passing reference");
		this.manager=dto;
	}

	// to display a manager get a manager first
	public void addManager(String name,long contactNo) {
		if(name!=null && contactNo>0) {
			this.manager=new ManagerDTO(name,contactNo);
			System.out.println("data is valid");
			
		}else {
			System.out.println("data is invalid");
		}
	}

	public void displayManager() {
		//if(this.manager!=null)
			
			System.out.println(this.manager.getName());
			System.out.println(this.manager.getContactNo());
	}
		
	

}
