package com.xworkz.DTO;

import java.util.Arrays;

public class PlayerDTO2Tester {

	public static void main(String[] args) {
	   
		PlayerDTO2 playerDTO2=new PlayerDTO2();
		playerDTO2.setCountryName("INDIA");
		System.out.println(playerDTO2.getCountryName());
		
		playerDTO2.setName("Sachin");
		System.out.println(playerDTO2.getName());
		
		String[] awardsList=new String[3];
		awardsList[0]="Khel Ratna";
		awardsList[1]="International";
		playerDTO2.setAwards(awardsList);
		System.out.println(awardsList[0]);
		System.out.println(Arrays.toString(awardsList));
		System.out.println(playerDTO2.getAwards());
		
		String[] sportsList=new String[3];
		sportsList[0]="Kabaddi";
		sportsList[1]="volley ball";
		playerDTO2.setSportsName(sportsList);
		System.out.println(Arrays.toString(sportsList));
		System.out.println(sportsList[2]);
		System.out.println(playerDTO2.getSportsName());
		
		
		

	}

}
