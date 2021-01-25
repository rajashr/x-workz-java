package com.xworkz.license.dao.impl;

import com.xworkz.license.dao.LicenseDAO;
import com.xworkz.license.dto.LicenseDTO;

public class LicenseDAOImplementor implements LicenseDAO{
	public void save(LicenseDTO dto) {
		System.out.println("invoked save method");
		System.out.println(dto);
		
	}

}
