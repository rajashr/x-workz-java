package com.xworkz.Registration.service;

import com.xworkz.Registration.dto.UserInformationDTO;

public interface UserServiceDAO {
	void validateAndSave(UserInformationDTO userInfoDTO);

}
