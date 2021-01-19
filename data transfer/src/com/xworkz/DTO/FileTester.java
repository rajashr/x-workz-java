package com.xworkz.DTO;

import java.util.Date;

public class FileTester {

	public static void main(String[] args) {
		FileDTO dto = new FileDTO();
		System.out.println(dto.getName());
		System.out.println(dto.getCreatedDate());
		dto = new FileDTO("backup.jpg", 159.67);
		System.out.println(dto.getName());
		System.out.println(dto.getSize());
		System.out.println(dto.getCreatedDate());
		Date currentDate = new Date();
		// System.out.println(currentDate);
		dto.setCreatedDate(currentDate);
		System.out.println(dto.getCreatedDate());
		dto.setLocation("C://images");
		dto.setType("jpg");
		Date date = new Date();
		FileDTO dto3 = new FileDTO("xworkz.jpg", 100.00, "jpg", "C://images", date);

	}

}
