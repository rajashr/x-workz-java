package com.xworkz.music.dto;

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
public class InformationDTO {
	private String username;
	private String password;
	private String email;
	private String mobileNo;
	private int infoId;

}
