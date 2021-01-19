package com.xworkz.DTO;

public class PlayerTester1 {

	private static final String Arrays = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlayerDTO1 playerDTO1 = new PlayerDTO1();
		playerDTO1.setCountryName("INDIA");
		System.out.println(playerDTO1.getCountryName());
		playerDTO1.setName("Sachin");
		System.out.println(playerDTO1.getName());

		// creating a array
		String[] awardsList = new String[3];
		// accessing the arrays
		awardsList[0] = "School";
		awardsList[1] = "National";
		// now we have to pass these values initialised to a :in paricular instance
		// there is a setAwards pass the
		// reference awardsList to to that
		playerDTO1.setAwards(awardsList); // we initialised array at index 0 & 1 we updated from default values to new
											// values using
		// set method and lets see them by using getmethod
		
	
   
		
		
		
		
		
	}

}
