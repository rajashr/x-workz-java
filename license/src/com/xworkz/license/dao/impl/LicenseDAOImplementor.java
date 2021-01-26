package com.xworkz.license.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.license.constants.VehicleType;
import com.xworkz.license.dao.LicenseDAO;
import com.xworkz.license.dto.LicenseDTO;

public class LicenseDAOImplementor implements LicenseDAO{
	
private List<LicenseDTO> dataBase;
	
	public LicenseDAOImplementor() {
		this.dataBase=new ArrayList<LicenseDTO>();
	}
	public void save(LicenseDTO dto) {
		System.out.println("invoked save method");
		System.out.println(dto);
		boolean saved=this.dataBase.add(dto);
		if(saved)
		System.out.println("dto is saved");
		else
			System.out.println("dto not saved");
		
	}
	@Override
		public LicenseDTO findByIdProofNo(String idProofNo) {
		System.out.println("invoked findByIdProofNo ");
		System.out.println("idProofNo " +idProofNo);
             for(LicenseDTO licenseDTO: this.dataBase) {
            	 String idProofNofrmdto=licenseDTO.getIdProofNo();
            	 if(idProofNofrmdto.equals(idProofNo)) {
            		 System.out.println("license found");
            		 return licenseDTO;
            	 }
             }
		return null;
		}
	@Override
		public boolean updateByIdProofNo(VehicleType vehicletype, String idProofNo) {
         System.out.println("invoked updateByIdProofNo");
         System.out.println(vehicletype);
         System.out.println(idProofNo);
         LicenseDTO idProofFRomDTO=this.findByIdProofNo(idProofNo);
         if(idProofFRomDTO!=null) {
        	 System.out.println("we can update license");
        	 idProofFRomDTO.setVehicleType(vehicletype);
        	 return true;
         }else {
        	 System.out.println("cant update license");
         }
		return false;
		}

}
