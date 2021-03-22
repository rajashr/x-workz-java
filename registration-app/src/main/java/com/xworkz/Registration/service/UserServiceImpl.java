package com.xworkz.Registration.service;

import com.xworkz.Registration.dao.UserInfoDAO;
import com.xworkz.Registration.dto.UserInformationDTO;

public class UserServiceImpl implements UserServiceDAO{
private UserInfoDAO dao;
public UserServiceImpl(UserInfoDAO dao) {
	this.dao=dao;
}

	@Override
	public void validateAndSave(UserInformationDTO userInfoDTO) {
		boolean validData=false;
		if(userInfoDTO!=null) {
			System.out.println("invoked validate method to save data");
			String firstName=userInfoDTO.getFirstName();
			if(firstName!=null && firstName.length()>3 && !firstName.contains(" ")){
				System.out.println("firstname is valid");
				validData=true;
			}else{
				System.out.println("firstname is invalid");
				validData=false;
			}
			if(validData) {
			String lastName=userInfoDTO.getLastName();
			if(lastName!=null && lastName.length()>3 && !lastName.contains(" ")) {
				System.out.println("lastname is valid");
				validData=true;
			}else {
				System.out.println("lastname is invalid");
				validData=false;
			}
			}
			if(validData) {
			String userName=userInfoDTO.getUserName();
			if(userName!=null && userName.length()>3 && !userName.contains(" ")) {
				System.out.println("userName is valid");
				validData=true;
			}else {
				System.out.println("userName is invalid");
				validData=false;
			}
			}
			if(validData) {
			String password=userInfoDTO.getPassword();
			
			if(password!=null && password.length()>3 && !password.contains(" ")) {
				System.out.println("password is valid");
				validData=true;
			}else {
				System.out.println("password is invalid");
				validData=false;
			}
			}
			if(validData) {
				System.out.println("can invoke dao");
				dao.saveUserDetails(userInfoDTO);
				
			}else {
				System.out.println("cannot invoke dao");
			}
			
			
		}else {
			System.out.println("dto is null");
		}
		
		
	}

}
