package com.xworkz.DTO;

import com.xworkz.DTO.SweetDTO.shape;

public class SweetDTOTester {

	public static void main(String[] args) {
		SweetDTO sweetDTO = new SweetDTO("Dry jamuna", 20.00);
		System.out.println(sweetDTO.getName());
		System.out.println(sweetDTO.getPrice());
		sweetDTO.setPopularState("Karnataka");
		System.out.println(sweetDTO.getPopularState());
		sweetDTO.setColor("Brown");
		System.out.println(sweetDTO.getColor());

		SweetDTO sweetDTO1 = new SweetDTO("Kerala", "white", shape.triangle);

	}

}
