package com.xworkz.programmingapti.sigletondesignpattern;

public class StaticinitSingleton {
	static StaticinitSingleton instance;
	private StaticinitSingleton() {
		System.out.println("invoking a private constructor");
	}
	static {
		try {
		instance=new StaticinitSingleton();
		}catch(Exception e){
		System.err.println(e.getMessage().getClass());
		}
	}
	public static StaticinitSingleton getInstance() {
		return instance;
	}

}
