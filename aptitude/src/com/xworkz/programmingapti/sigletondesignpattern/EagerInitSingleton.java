package com.xworkz.programmingapti.sigletondesignpattern;

public class EagerInitSingleton {
	static final EagerInitSingleton instance=new EagerInitSingleton();
	private EagerInitSingleton() {
		System.out.println("invoke  "  + this.getClass().getSimpleName());
	}
	public static EagerInitSingleton getInstance() {
		return instance;
	}
	

}
