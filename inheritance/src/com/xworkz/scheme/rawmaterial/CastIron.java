package com.xworkz.scheme.rawmaterial;

import com.xworkz.scheme.govtschemes.RawMaterial;

public class CastIron extends RawMaterial{
	
	//raw has a property which is protected so we are forcing to implement a method
protected String name;
	
	//protected RawMaterial() {
		//System.out.println("default constructor");
	//}
    public CastIron() {
    	super();//call to default constructor from parent
    }
	
	public void delivery() {
		System.out.println("invoked delivery ,delivery by road");
	}
	
	public  void Manufacture() {
		System.out.println("invoked manufacture by castIron");
	}


}
