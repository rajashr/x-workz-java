package com.xworkz.license.dto;

import java.util.Date;

import com.xworkz.license.constants.BloodGroup;
import com.xworkz.license.constants.Gender;

public class CommonDTO {
	private String name;
	private int age;
	private AddressDTO addressDTO;
	private long mobile;
	private BloodGroup bloodGroup;
	private Gender gender;
	private Date DOB;
	public CommonDTO() {
		super();
	}
	public CommonDTO(String name, int age, AddressDTO addressDTO, long mobile, BloodGroup bloodGroup, Gender gender,
			Date dOB) {
		super();
		this.name = name;
		this.age = age;
		this.addressDTO = addressDTO;
		this.mobile = mobile;
		this.bloodGroup = bloodGroup;
		this.gender = gender;
		DOB = dOB;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public AddressDTO getAddressDTO() {
		return addressDTO;
	}
	public void setAddressDTO(AddressDTO addressDTO) {
		this.addressDTO = addressDTO;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public BloodGroup getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(BloodGroup bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}

}
