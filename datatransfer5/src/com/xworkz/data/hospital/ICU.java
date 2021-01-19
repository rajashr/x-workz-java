package com.xworkz.data.hospital;
import com.xworkz.data.DTO.ICUAdmissionDTO;
public class ICU {
	//lets write a properties of icu
	private boolean ventilatorAvailable;
	private double price;
	private boolean tvAvailable;
	
	private ICUAdmissionDTO icuAdmissionDTO; //this is the way we related one class to another class this is a field with class as a data type
	//it dont make sense that icu has a name,age,reason,doctor so we are writing dto to make readability better
	//constructor using all fields
	public ICU(boolean ventilatorAvailable, double price, boolean tvAvailable) {
		super();
		this.ventilatorAvailable = ventilatorAvailable;
		this.price = price;
		this.tvAvailable = tvAvailable;
	}
	
	//lets write a method
	//for taking admission what are all the properties u can give means here a parameter
	public void admission(String name,String reason,int age,String doctor) {
		System.out.println("created appointment");
		this.icuAdmissionDTO=new ICUAdmissionDTO(name,reason,age,doctor);
	}

	public ICUAdmissionDTO getIcuAdmissionDTO() {
		return icuAdmissionDTO;
	}

	public void setIcuAdmissionDTO(ICUAdmissionDTO icuAdmissionDTO) {
		this.icuAdmissionDTO = icuAdmissionDTO;
	}
	
	
	

}
