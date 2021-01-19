package com.xworkz.carshow.dto.carshowroom;

import com.xworkz.carshow.dto.CarDTO;
import com.xworkz.carshow.dto.CarVariant;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarShowRoom carShowRoom=new CarShowRoom();
		carShowRoom.addManager("rani", 9481827790l);
		carShowRoom.display();
		carShowRoom.addManager(null, 9481827790l);
		carShowRoom.display();
		
		//carShowRoom.removeManager();
		//lets display and see who is the current manager
		//carShowRoom.display();
		//CarDTO cardto=new CarDTO("Swift",15000,CarVariant.MID);
		//carShowRoom.addCar(cardto);//by doing this the above values of model price and variant gets updated in the carDTO
		//carShowRoom.displaycar();
		//CarDTO cardto1=new CarDTO("hondai",2557,CarVariant.BasE);
		//carShowRoom.addCar(cardto1);
		//carShowRoom.displaycar();
		//CarDTO cardto2=new CarDTO("kia",674849,CarVariant.MID);
		//carShowRoom.addCar(cardto2);
		//carShowRoom.displaycar();
		//CarDTO cardto3=new CarDTO("indica",78765,CarVariant.TOP);
		//carShowRoom.addCar(cardto3);
		//carShowRoom.displaycar();
		//CarDTO cardto4=new CarDTO("AUDI",89943,CarVariant.TOP);
		//carShowRoom.addCar(cardto4);
		//carShowRoom.displaycar();
		
		
		

	}

}
