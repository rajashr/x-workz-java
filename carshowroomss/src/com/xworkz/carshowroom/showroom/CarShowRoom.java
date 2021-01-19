package com.xworkz.carshowroom.showroom;

import com.xworkz.carshowroom.DTO.ManagerDTO;

public class CarShowRoom {
	/*
	 * write the fields that a car show room have
	 */
	private String name;
	private String location;
	//it wil have a manager but here we are using manager dto as a type 
	private ManagerDTO managerdto;
	//related one class to other class ---has A relation
	
	public CarShowRoom() {
		System.out.println("crashowroom default constructor");
	}
	public CarShowRoom(String name,String location) {
		this.name=name;
		this.location=location;
	}
	//user should give the inputs so we create method basically to call it anywhere and change the details 
	//here we can add manager whenever we want writing a addmanager method makes it sure
	//cal the method pass the arguments to parameters as your requirement
	public void addManager(String name,long contactNo) {
		if(name!=null && contactNo>0) {
			this.managerdto=new ManagerDTO(name,contactNo);
			System.out.println("create manager");
		}else {
			System.out.println("cannot create manager");
		}
		
		
		//here we have initialised using constructor then we can see using get()
	
		
		//now lets check by using another class
	}
	
	public void addManager(ManagerDTO dto) {
		if(dto!=null) {
			this.managerdto=dto;	
			System.out.println("create manager");
		}
		else {
			System.out.println("cannot create manager");
		}
		
		
	}
	public void display() {
		System.out.println(this.managerdto.getContactNo());
		System.out.println(this.managerdto.getName());
	}
	

}
