package com.xworkz.license;

import java.util.Date;

import com.xworkz.license.constants.BloodGroup;
import com.xworkz.license.constants.Gender;
import com.xworkz.license.constants.IdProof;
import com.xworkz.license.constants.VehicleType;
import com.xworkz.license.dao.impl.LicenseDAOImplementor;
import com.xworkz.license.dto.AddressDTO;
import com.xworkz.license.dto.LicenseDTO;

public class LicenseTester {
	public static void main(String[] args) {
		AddressDTO addressDTO=new AddressDTO("Karnataka", "Hungund", "Jaya-Nagar", 587118, "Shanti-Nilaya", "NA", 7588);
		Date date=new Date();
		LicenseDTO dto=new LicenseDTO("Rajashree", 23, addressDTO, 9481827790l, BloodGroup.O_POSITIVE, Gender.FEMALE,date );
		dto.setIdProof(IdProof.AADHAR);
		dto.setIdProofNo("485330002814");
		dto.setVehicleType(VehicleType.TWO_WHEELER);
		dto.setCommercial(false);
		dto.setDisability(false);
		dto.setStartDate(new Date());
		
		LicenseDAOImplementor impl=new LicenseDAOImplementor();
		impl.save(dto);
	}

}
