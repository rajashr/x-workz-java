package com.xworkz.carshow.dto.carshowroom;

import com.xworkz.carshow.dto.CarDTO;
import com.xworkz.carshow.dto.CarVariant;
import com.xworkz.carshow.dto.ManagerDTO;

public class CarShowRoom {
	private String name;
	private String location;
	private ManagerDTO manager;
	private CarDTO[] cars=new CarDTO[5];
	private CarVariant variant;
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

	public void addManager(String name, long contactNo) {
		if (name != null && contactNo > 0) {
			this.manager = new ManagerDTO(name, contactNo);
			System.out.println("data is valid create manager");
		} else {
			System.out.println("data is invalid");
		}
	}

	public void display() {
		//if (this.manager != null) {
			System.out.println(this.manager.getName());
			System.out.println(this.manager.getContactNo());
		//} else {
			//System.out.println("manager is not there");
		//}
	}

	public void removeManager() {
		this.manager = null;
		System.out.println("removed manager");
	}
	//we get the cars here car will not be one in showroom so we need to get array of cars
	//show room can hold maximum of five cars
	//trying to call cars one by one
	public void addCar(CarDTO dto) {
		//this.cars[0]=dto;//if we wnt the model or price or variant of another car we have to again do the same 
		//this.cars[1]=dto;//instead of this we can improve our code
		this.cars[currentIndex]=dto;
		this.currentIndex++;
		
		
	}
	public void displaycar() {
	
		System.out.println(this.cars[this.currentIndex].getModel());
		System.out.println(this.cars[this.currentIndex].getVariant());
		System.out.println(this.cars[this.currentIndex].getPrice());
		System.out.println(this.cars[this.currentIndex].getModel());
		System.out.println(this.cars[this.currentIndex].getVariant());
	}

}
