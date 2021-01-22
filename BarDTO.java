package com.xworkz.solving.solutions.dto;

public class BarDTO {
	private String name;
	private String brandName;
	private double spiritPercentage;
	
	
	public BarDTO() {
		System.out.println("default constructor");
	}


	public BarDTO(String name, String brandName, double spiritPercentage) {
		super();
		this.name = name;
		this.brandName = brandName;
		this.spiritPercentage = spiritPercentage;
	}
	
	
	@Override
	public String toString() {
		return "BarDTO [name=" + name + ", brandName=" + brandName + ", spiritPercentage=" + spiritPercentage + "]";
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj==null)
			return false;
		if(obj instanceof BarDTO) {
			BarDTO dto=(BarDTO)obj;
			if(dto.getBrandName().equals(this.brandName)) {
				System.out.println("brand name matches");
				return true;
			}
		}
		return false;
	}


	public String getName() {
		return name;
	}


	public String getBrandName() {
		return brandName;
	}


	public double getSpiritPercentage() {
		return spiritPercentage;
	}
	
	

}
