package com.xworkz.resort.service;

import com.xworkz.resort.dao.ResortDAO;
import com.xworkz.resort.dao.ResortDAOImpl;
import com.xworkz.resort.dto.ResortDTO;

public class ServiceDAOImpl implements ServiceDAO{
	private ResortDAO resortDAO;
	public ServiceDAOImpl(ResortDAO dao) {
		this.resortDAO=dao;
	}

	@Override
	public void validateAndsave(ResortDTO dto) {
		boolean validData=false;
		
		if(dto!=null) {
			int id=dto.getResortId();
			if(id!=0 && id>=1) {
				System.out.println("id is valid");
				validData=true;
			}else {
				System.out.println("id is not valid");
				validData=false;
			}
			
			
			if(validData) {
			String name=dto.getResortName();
			if(name != null && name.length() >= 3 && !name.isEmpty() && !name.contains(" ")) {
				System.out.println("name is valid");
				validData=true;
			}else {
				System.out.println("name is invalid");
				validData=false;
			}
			}
			
			if(validData) {
			String location=dto.getLocation();
			if(location != null && location.length() >= 3 && !location.isEmpty() && !location.contains(" ")) {
				System.out.println("location is valid");
				validData=true;
				
			}else {
				System.out.println("location is invalid");
				validData=false;
			}
			}
			
			if(validData) {
			int noOfEmloyees=dto.getNoOfEmployees();
			if(noOfEmloyees!=0 && noOfEmloyees>=100) {
				System.out.println("noOfEmloyees are valid");
				validData=true;
			}else {
				System.out.println("noOfEmloyees are invalid");
				validData=false;
			}
			}
			
			if(validData) {
			int noOfRooms=dto.getNoOfRooms();
			if(noOfRooms!=0 && noOfRooms>=50) {
				System.out.println("noOfRooms are valid");
				validData=true;
			}else {
				System.out.println("noOfRooms are invalid");
				validData=false;
			}
			}
			if(validData) {
				System.out.println("can invoke save method from dao");
				//ResortDAO dao=new ResortDAOImpl();
				resortDAO.save(dto);
			}
		}else {
			System.out.println("dto is null , invalid data");
		}
		
	}
	

}
