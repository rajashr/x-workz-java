package com.xworkz.carshowroom;
import com.xworkz.carshowroom.dto. ManagerDTO;

public class CarShowRoom {
	private String name;
	private String location;
	private  ManagerDTO managerdto;
	
	
	public CarShowRoom() {
		super();
		System.out.println("created using default constructor");
	}


	public CarShowRoom(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}
	public void addManager(String name,long contactNo) {
		this.managerdto=new ManagerDTO(name,contactNo);
	}
	

	
	
	
	

}
