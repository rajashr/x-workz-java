package com.xworkz.Registration.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter 
@NoArgsConstructor
@ToString

@Entity
@Table(name="registration_details")
public class UserInformationDTO {
	@Column(name="REGISTER_ID")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int UserId;
	@Column(name="FIRST_NAME")
	private String firstName;
	@Column(name="LAST_NAME")
	private String lastName;
	@Column(name="USER_NAME")
	private String userName;
	@Column(name="PASS_WORD")
	private String password;
	public UserInformationDTO(String firstName, String lastName, String userName, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
	}
	

}
