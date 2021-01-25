package com.xworkz.programmingapti.sigletondesignpattern;

public class LazyinitSingleton {
	static LazyinitSingleton LazyinitSingleton;
	private LazyinitSingleton() {
		System.out.println("invoke  " + this.getClass().getSimpleName());
	}
	public static LazyinitSingleton getLazyinitSingleton() {
		if(LazyinitSingleton==null)
		LazyinitSingleton=new LazyinitSingleton();
		return LazyinitSingleton;
	}

}
