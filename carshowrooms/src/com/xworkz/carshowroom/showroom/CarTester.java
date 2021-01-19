package com.xworkz.carshowroom.showroom;

import com.xworkz.carshowroom.dto.CarVariant;
import com.xworkz.carshowroom.dto.CarDTO;

public class CarTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarShowRoom carShowRoom=new CarShowRoom();
		carShowRoom.addCars("Tesla", 200000, CarVariant.MID);
		carShowRoom.displayCars();
		
		CarDTO carDTO=new CarDTO("Swift",500000,CarVariant.TOP);
		//in particular instance of carShowRoom there is a method called addCars call it and pass the reference of carDTO
		carShowRoom.addCars(carDTO);
		carShowRoom.displayCars();

	}

}
