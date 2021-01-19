package com.xworkz.carshowroom.showroom;

import com.xworkz.carshowroom.showroom.DTO.CarDTO;
import com.xworkz.carshowroom.showroom.DTO.CarVariant;
import com.xworkz.carshowroom.showroom.DTO.ManagerDTO;

public class Tester {

	public static void main(String[] args) {
		CarShowRoom carShowRoom=new CarShowRoom();
		//ManagerDTO mana=new ManagerDTO();
		//carShowRoom.addManager(mana);//the argument which we pass to this method should be a reference of ManagerDTO
		//bcoz in carShowRoom class we wrote a method addManager with parameter dto
		//and we made that parameter equal to reference of managerDTO
		carShowRoom.addManager("rani", 9481827790l);
		carShowRoom.displayManager();
		carShowRoom.removeManager();
		carShowRoom.displayManager();
		CarDTO dto1=new CarDTO("swift",78900,CarVariant.base);
		carShowRoom.addCars(dto1);
		carShowRoom.displayCars();
		
	}

}
