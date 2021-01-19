package com.xworkz.carshowroom.showroom;

public class ShowRoomTester1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShowRoom1 showRoom1=new ShowRoom1();
		showRoom1.addManager("rani", 1);//conditions will get true prints corect value no NPE
        showRoom1.displayManager();

	}

}
