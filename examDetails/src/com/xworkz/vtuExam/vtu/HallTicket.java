package com.xworkz.vtuExam.vtu;

public class HallTicket {
	private String name;
	private String USN;
	
	public HallTicket() {
		System.out.println("default constructor");
	}
	
	public HallTicket(String name,String USN) {
		System.out.println("parameterised constructor");
		this.name=name;
		this.USN=USN;
	}
	
	public void displayDetails() {
		System.out.println(this.name);
		System.out.println(this.USN);
	}
	
	

}
