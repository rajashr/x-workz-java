package com.xworkz.carshowroom.showroom;

import com.xworkz.carshowroom.dto.ManagerDTO;
import com.xworkz.carshowroom.dto.CarDTO;
import com.xworkz.carshowroom.dto.CarVariant;

public class CarShowRoom {

	private String name;
	private String location;
	// how can we relate one class to another class is by using has a relation
	private ManagerDTO manager;
	
	private  CarDTO[] cars=new CarDTO[5]; //CarDTO array
	private int currentIndex=0;
	//we have used enum so lets call it classType_variable/reference name which is relating the classes.
	private CarVariant variant;
	//currentIndex=0;

	public CarShowRoom() {
		super();
		System.out.println("created using default constructor");
	}

	public CarShowRoom(String name, String location) {
		super();
		System.out.println("created using parameterised constructor");
		this.name = name;
		this.location = location;
	}
	//sec way to addManager
	public void addManager(ManagerDTO dto) {
		System.out.println("adding manager by passing reference");
		this.manager=dto;
	}

	// to display a manager get a manager first
	public void addManager(String name, long contactNo) {
		// lets to validation to avoid null pointer exception
		if(name!=null && contactNo>0) {
		this.manager = new ManagerDTO(name, contactNo);
		System.out.println("data is valid can add manager");
		}
		else {
			System.out.println("data is invalid to add manager");
		}
	}

	public void displayManager() {
			System.out.println(this.manager.getContactNo());
			System.out.println(this.manager.getName());
	}
		
		
	
	public void removeManager() {
		this.manager=null; //now we tryimg to remove the added manger lets test it in tester
		System.out.println("removed manager");
	}
	
	public void updateManager(long contactNo) {
		if(contactNo>0) {
			System.out.println("update "+contactNo);
			this.manager.setContactNo(contactNo);
		}else {
			System.out.println("cant update");
		}
	}
	
	public void updateManager(String name) {
		if(this.manager!=null) {
			System.out.println("can update name"+name);
			this.manager.setName(name);
		}else {
			System.out.println("invalid data");
		}
	}
	
	public void addCars(String model,long price,CarVariant variant ) {
		System.out.println("invoked addCars method");
		if(this.cars!=null && this.currentIndex<5) {
        System.out.println("can add car");
			this.cars[currentIndex]=new CarDTO(model, price, variant);
			this.currentIndex++;	
		}else {
			System.out.println("cannot add car");
		}
		
	}
	
	//another method to add cars using reference creating object sing new in tester
	public void addCars(CarDTO dto) {
		if(dto!=null && this.currentIndex<5) {
			System.out.println("can add car");
			this.cars[this.currentIndex]=dto;
		}
		
	}
	public void displayCars() {
		if(this.cars[currentIndex]!=null) {
		System.out.println(this.cars[this.currentIndex].getModel()); //only this line gives nullPointerException
	}else {
		System.out.println("cannot diplay or car is not there");
	}
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public ManagerDTO getManager() {
		return manager;
	}

	public void setManager(ManagerDTO manager) {
		this.manager = manager;
	}

	public CarDTO[] getCars() {
		return cars;
	}

	public void setCars(CarDTO[] cars) {
		this.cars = cars;
	}

	public int getCurrentIndex() {
		return currentIndex;
	}

	public void setCurrentIndex(int currentIndex) {
		this.currentIndex = currentIndex;
	}

	public CarVariant getVariant() {
		return variant;
	}

	public void setVariant(CarVariant variant) {
		this.variant = variant;
	}

}
