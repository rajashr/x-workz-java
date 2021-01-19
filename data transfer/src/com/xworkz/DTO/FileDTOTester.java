package com.xworkz.DTO;

import java.util.Date;

public class FileDTOTester {

	public static void main(String[] args) {
		FileDTO fileDTO = new FileDTO();
		// if i initialise using default constructor then i have to use set method to
		// initialise every property
		// the code will become too large
		System.out.println(fileDTO.getCreatedDate()); // null
		System.out.println(fileDTO.getLocation());// null
		System.out.println(fileDTO.getName());// null
		System.out.println(fileDTO.getSize());// 0.0
		System.out.println(fileDTO.getType());// null

		Date currentDate = new Date(); // we can print current date by passing reference
		System.out.println(currentDate);

		System.out.println(new Date());// or we can directly print date without passing reference

		fileDTO.setLocation("//: c");
		System.out.println(fileDTO.getLocation());
		fileDTO.setName("images");
		System.out.println(fileDTO.getName());
		fileDTO.setType("jpg");
		System.out.println(fileDTO.getType());// in instance fileDto there is a method get() invoke it
		fileDTO.setSize(150.55);
		System.out.println(fileDTO.getSize());// date is inbuilt class or object we can see constructor overloading

		// lets improve our code by initialising two properties using constructor and
		// other properties using setter method

		FileDTO fileDTO1 = new FileDTO("movieNames", 150.05);
		System.out.println(fileDTO1.getName());
		System.out.println(fileDTO1.getSize());
		fileDTO.setLocation("//:D");
		System.out.println(fileDTO.getLocation());
		fileDTO.setType("java");
		System.out.println(fileDTO.getType());
		Date currentDate1 = new Date();
		System.out.println(currentDate1);
		// lets improve our code by initialising all 5 properties using a single
		// constructor
		FileDTO fileDTO2 = new FileDTO("ScreenShot", 160.55, "sch", "/:F", new Date());
		System.out.println(fileDTO2.getLocation());
		System.out.println(fileDTO2.getName());
		System.out.println(fileDTO2.getSize());
		System.out.println(fileDTO2.getSize());
		System.out.println(fileDTO2.getType());
		System.out.println(fileDTO2.getCreatedDate());

	}

}
