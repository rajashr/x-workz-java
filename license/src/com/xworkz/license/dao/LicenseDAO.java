package com.xworkz.license.dao;

import com.xworkz.license.constants.VehicleType;
import com.xworkz.license.dto.LicenseDTO;

public interface LicenseDAO {
	
	public void save(LicenseDTO dto);
	LicenseDTO findByIdProofNo(String idProofNo);
	boolean updateByIdProofNo(VehicleType vehicletype,String idProofNo);

}
