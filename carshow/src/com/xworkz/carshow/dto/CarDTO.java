package com.xworkz.carshow.dto;

public class CarDTO {
	private String model;
	private int price;
	private CarVariant variant;
	
	
	public CarDTO() {
		super();
	}
	public CarDTO(String model, int price, CarVariant variant) {
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public CarVariant getVariant() {
		return variant;
	}
	public void setVariant(CarVariant variant) {
		this.variant = variant;
	}
	
	

}
