package com.xworkz.use.DTO;

public class PoliceStationDTO {
	@Override
	public String toString() {
		return "PoliceStationDTO [name=" + name + ", noOfCells=" + noOfCells + ", area=" + area + "]";
	}

	// public String toString() {
	// return "PoliceStationDTO"; //return value which is string
	// }
	private String name;
	private int noOfCells;
	private String area;

	// lets write a constructor to initialise these above fields
	public PoliceStationDTO() {
		super();
	}

	public PoliceStationDTO(String name, int noOfCells, String area) {
		super();
		this.name = name;
		this.noOfCells = noOfCells;
		this.area = area;
	}
	@Override
	public int hashCode() {
		return 45;
	}

	public boolean equals(Object obj) {

		if (obj != null) {
			if (obj == this) {
				return true;
			} else {
				if (obj instanceof PoliceStationDTO) {

					PoliceStationDTO casted = (PoliceStationDTO) obj;
					if (casted.getName() != null && casted.getName().equals(this.name)) {
						System.out.println("name is same");
						return true;
					} else {
						System.out.println("name is not same");
					}
				}
			}
		} 
		System.out.println("object not equal");
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfCells() {
		return noOfCells;
	}

	public void setNoOfCells(int noOfCells) {
		this.noOfCells = noOfCells;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	// inorder to read use get methods

}
