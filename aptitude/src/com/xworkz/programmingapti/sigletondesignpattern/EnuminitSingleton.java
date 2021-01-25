package com.xworkz.programmingapti.sigletondesignpattern;

public enum EnuminitSingleton {
	INSTANCE;
	
	private EnuminitSingleton() {
		System.out.println("invoke  " +this.getClass().getSimpleName());
	}

}
