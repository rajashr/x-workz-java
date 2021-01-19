package com.xworkz.scheme.rawmaterial;

import com.xworkz.scheme.govtschemes.RawMaterial;

public class Magnesium extends RawMaterial{
	public Magnesium() {
    	super();//call to default constructor from parent
    }
	
	public void delivery() {
		System.out.println("invoked delivery ,delivery by waterWays");
	}
	
	public  void Manufacture() {
		System.out.println("invoked manufacture by Magnesium");
	}

}
