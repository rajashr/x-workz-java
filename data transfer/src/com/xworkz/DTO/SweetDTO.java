package com.xworkz.DTO;

public class SweetDTO {
	private String name;
	private double price;
	private String popularState;
	private String color;

	private enum shape {
		triangle, square, round, flat
	};

	public SweetDTO() {
		System.out.println("created SweetDTO using default constructor");
	}

	public SweetDTO(String name, double price) {
		System.out.println("created SweetDTO using parameterised constructor");
		this.name = name;
		this.price = price;

	}

	public SweetDTO(String popularState, String color, final String shape) {
		System.out.println("created sweet dto using constructor");
		this.color = color;
		this.popularState = popularState;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPopularState() {
		return popularState;
	}

	public void setPopularState(String popularState) {
		this.popularState = popularState;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
