package com.xworkz.DTO;

import java.util.Arrays;

public class PlayerdtoTester {

	public static void main(String[] args) {
		Playerdto playerdto = new Playerdto();
		// lets print all the default values by accessing the instance variable using
		// reference variable
		System.out.println(playerdto.getCountryName());
		System.out.println(playerdto.getName());
		System.out.println(Arrays.toString(playerdto.getAwards()));
		System.out.println(Arrays.toString(playerdto.getSportsName()));

		// in the particular instance playerdto there is a method getSportsName call it
		// because we cant directly access the instance var as they are private so now
		// we can see them by using get method
		// and initialise using set method or constructor

		// for(int i=0;i<playerdto.getAwards().length;i++) {
		// String award=playerdto.getAwards()[i];
		// System.out.println(award);

		// }

		playerdto.setCountryName("USA");
		System.out.println(playerdto.getCountryName());
		playerdto.setName("sachin");
		System.out.println(playerdto.getName());
		
		String[] awardsList = new String[3];
		awardsList[0] = "School";
		awardsList[1] = "National";
		playerdto.setAwards(awardsList);
		System.out.println(playerdto.getAwards());
		System.out.println(Arrays.toString(awardsList));

	}

}
