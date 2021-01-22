package com.xworkz.solving.solutions.dto;

public class ShoppingCartDTO {
	private String item;
	private double price;
	private int quantity;
	public ShoppingCartDTO() {
		super();
	}
	public ShoppingCartDTO(String item, double price, int quantity) {
		super();
		this.item = item;
		this.price = price;
		this.quantity = quantity;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	

}
