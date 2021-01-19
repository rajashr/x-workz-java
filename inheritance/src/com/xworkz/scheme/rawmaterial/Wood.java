package com.xworkz.scheme.rawmaterial;

import com.xworkz.scheme.govtschemes.RawMaterial;

public class Wood extends RawMaterial{
	 public Wood() {
	    	super();//call to default constructor from parent
	    }
		
		public void delivery() {
			System.out.println("invoked delivery ,delivery by ships");
		}
		
		public  void Manufacture() {
			System.out.println("invoked manufacture by wood");
		

	}
}


