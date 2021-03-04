package com.xworkz.resort.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Entity
@Table(name="resort_table")
public class ResortDTO {
	@Column(name="RESORT_ID")
	@Id
	private int resortId;
	@Column(name="NAME")
	private String resortName;
	@Column(name="LOCATION")
	private String location;
	@Column(name="NO_OF_EMPLOYEES")
	private int noOfEmployees;
	@Column(name="NO_OF_ROOMS")
	private int noOfRooms;

}
