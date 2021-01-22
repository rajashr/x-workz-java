package com.xworkz.solving;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.solving.solution.dto.ShoppingcartDTO;

public class ShoppingcartTester {

	public static void main(String[] args) {
		ShoppingcartDTO dto1 = new ShoppingcartDTO();
		dto1.setName("Kurta");
		dto1.setPrice(499);
		dto1.setQuantity(1);

		ShoppingcartDTO dto2 = new ShoppingcartDTO();
		dto2.setName("Shoe");
		dto2.setPrice(1500);
		dto2.setQuantity(1);

		Collection<com.xworkz.solving.solution.dto.ShoppingcartDTO> cartDTOs = new ArrayList<ShoppingcartDTO>();
		cartDTOs.add(dto1);
		cartDTOs.add(dto2);

		ShoppingcartDTO dto3 = new ShoppingcartDTO();
		dto3.setName("Shoe");
		dto3.setPrice(1500);
		dto3.setQuantity(1);

		boolean contains = cartDTOs.contains(dto3);
		System.out.println("contains "+contains);

		if (contains) {
			System.out.println("Cart has Shoe and size of colection is " + cartDTOs.size());
		} else {
			System.out.println("added dto3 " + cartDTOs.add(dto3));
			System.out.println("size of collection " + cartDTOs.size());
		}

	}

}
