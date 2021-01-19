package com.xworkz.carshowroom.showroom;

import com.xworkz.carshowroom.DTO.ManagerDTO;

public class ShowRoomTester {
	public static void main(String[] args) {
		CarShowRoom carShowRoom=new CarShowRoom();
		//lets add manager by calling that method which is in instance block by using reference
		carShowRoom.addManager("rani", 9481827790l);
		
		ManagerDTO managerdto=new ManagerDTO(null,9887546l);
		carShowRoom.addManager(managerdto);
		carShowRoom.display();
	}

}
