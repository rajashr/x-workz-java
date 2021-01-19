package com.xworkz.carshowroom.showroom;
import com.xworkz.carshowroom.showroom.CarShowRoom;
import com.xworkz.carshowroom.dto.*;


public class ShowRoomTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarShowRoom carShowRoom=new CarShowRoom();
		
		carShowRoom.addManager("rani",444455677);
		//carShowRoom.addManager(null); //here we cant pass null do validation
		carShowRoom.displayManager();
		carShowRoom.removeManager();
		carShowRoom.displayManager();
		
		ManagerDTO dto=new ManagerDTO("dec",55);//as in add method we have to pass the reference of ManagerDTO 
		//so we created an ManagerDTO now we are passing the reference
		//lets call method addManager and pass reference of ManagerDTO 
		//in reference carShowRoom there is a addManager method invoke it and pass the reference
		carShowRoom.addManager(dto);
		carShowRoom.updateManager(-1);
		carShowRoom.updateManager("ranis");
		carShowRoom.updateManager(4567);
		
		
		
		
	}

}
