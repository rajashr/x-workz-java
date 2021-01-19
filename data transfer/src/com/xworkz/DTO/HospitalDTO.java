package com.xworkz.DTO;

public class HospitalDTO {
	private String name;
	private String location;
	private int appointmentSlots = 5;
    private AppointmentDTO appointmentDTO;
	public HospitalDTO() {
		System.out.println("created hospital using default constructor");
		this.name = name;
		this.location = location;
		this.appointmentSlots = appointmentSlots;

	}

	public void appointment(String name, long mobile, int age, String reason, String doctorName) {
//using these variables as field i can write Dto
		this.appointmentDTO=appointmentDTO;
	}
}
