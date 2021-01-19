package com.xworkz.carshowroom.dto;

public class CarDTO {
	private String model;
	private long price;
	private CarVariant variant;
	
	
	public CarDTO(String model, long price, CarVariant variant) {
		super();
		this.model = model;
		this.price = price;
		this.variant = variant;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public long getPrice() {
		return price;
	}


	public void setPrice(long price) {
		this.price = price;
	}


	public CarVariant getVariant() {
		return variant;
	}


	public void setVariant(CarVariant variant) {
		this.variant = variant;
	}
	
	//lets initialise all using constructor
	

}
