package com.xworkz.data.DTO;

public class ICUAdmissionDTO {
	//dto store only a data not used to write any logic
	
	private String name;
	private String reason;
	private int age;
	private String doctor;
	//we can use set or constructor or literals to initialise now
	
	public ICUAdmissionDTO(String name, String reason, int age, String doctor) {
		super();
		this.name = name;
		this.reason = reason;
		this.age = age;
		this.doctor = doctor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDoctor() {
		return doctor;
	}

	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}
	

}
