package com.xworkz.solving;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.solving.solutions.dto.BarDTO;



public class BarTester {

	public static void main(String[] args) {
		
		BarDTO dto1=new BarDTO("magic moments", "King Fisher", 48);
		
		BarDTO dto2=new BarDTO("IB", "King Fisher", 6);
		
		BarDTO dto3=new BarDTO("Royal Stag", "Old Monk", 8);
		
		BarDTO dto4=new BarDTO("Storm", "NA", 32);
		
		List<BarDTO> listDTOs=new ArrayList<BarDTO>();
		
		listDTOs.add(dto1);
		listDTOs.add(dto2);
		listDTOs.add(2,dto3);
		listDTOs.add(dto4);
		
		
		
		BarDTO dto5=new BarDTO("magic moments", "NA", 48);
		listDTOs.add(3, dto5);
		
		
		
		
		int index=listDTOs.indexOf(dto5);
		System.out.println("index is dto5 is "+index);
		
		int lastIndex=listDTOs.lastIndexOf(dto3);
		System.out.println("last index of dto1 is "+lastIndex);
		
		
		for (BarDTO alcoholDTO : listDTOs) {
			System.out.println(alcoholDTO);
		}

	}

}
