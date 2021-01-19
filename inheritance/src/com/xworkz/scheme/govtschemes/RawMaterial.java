package com.xworkz.scheme.govtschemes;

public abstract class RawMaterial {
	//as the class is abstract we cant create a object directly so lets extend access properties of parent
	protected String name;
	
	protected RawMaterial() {
		System.out.println("default constructor");
	}
	
	public void delivery() {
		System.out.println("invoked delivery");
	}
	
	public abstract void Manufacture();

}
