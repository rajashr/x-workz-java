package com.xworkz.use.uses;

import com.xworkz.use.DTO.PoliceStationDTO;

public class RailwayStationDTO extends PoliceStationDTO {
	public RailwayStationDTO(String name, int noOfCells, String area) {
		super(name,noOfCells,area);
		
	}
	@Override
	public int hashCode() {
		return 46;
	}
	

}
