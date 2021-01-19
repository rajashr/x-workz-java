package com.xworkz.carshowroom.showroom;

import com.xworkz.carshowroom.showroom.DTO.CarDTO;
import com.xworkz.carshowroom.showroom.DTO.ManagerDTO;

public class CarShowRoom {
	private String name;
	private String location;
	private ManagerDTO manager;//here we are adding manager as initially showroom was not having a manager
	//but by relati8ng a class managerDTO to this class we added manager
	//but still it is  pointing to null as a managerdto is off class type by default pointing to null so 
	//we should add manager by using method to carshowroom
	private CarDTO[] cars=new CarDTO[5];
	private int currentIndex=0;
	public CarShowRoom(String name, String location, ManagerDTO manager) {
		super();
		this.name = name;
		this.location = location;
		this.manager = manager;
	}
	public CarShowRoom() {
		super();
	}
	
	public void addManager(String name,long contactNo) {
		
		//see what are a properties a manager have in dto and while adding manager using method we should pass them
		if(name!=null && contactNo>0) {
		this.manager=new ManagerDTO(name,contactNo);//calling of a constructor
		System.out.println("data is valid ");
		}else {
			System.out.println("data is invalid");
		}
	}
	//why we are making to pas the reference of managerdtop and cardo is that there already exist some data like price model
	//name for manager and his contactNo now no need to write again just by making references common we can go there and update
	//values
	public void addManager(ManagerDTO dto) {
		this.manager=dto;
	}
	//lets test it
	public void displayManager() {
		//we cant directly access as properies are in dto are private
		if(this.manager!=null) {
		System.out.println(this.manager.getContactNo());
		System.out.println(this.manager.getName());
		}else {
			System.out.println("manager is not there");
		}
		
	}
	public void removeManager() {
		this.manager=null;
		System.out.println("removed manager");
	}
	//show room will have cars lets add car to showroom now
	public void addCars(CarDTO dto) {
		if(dto!=null) {
		this.cars[currentIndex]=dto;
		currentIndex++;
		}else {
			System.out.println("invalid data cannot add car");
		}
	}
	public void displayCars() {
		if(this.cars[currentIndex]!=null) {
		System.out.println(this.cars[currentIndex].getModel());
	}else {
		System.out.println("car is not there");
	}
	}		
		
}
