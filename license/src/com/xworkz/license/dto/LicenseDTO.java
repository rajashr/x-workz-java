package com.xworkz.license.dto;

import java.util.Date;

import com.xworkz.license.constants.BloodGroup;
import com.xworkz.license.constants.Gender;
import com.xworkz.license.constants.IdProof;
import com.xworkz.license.constants.VehicleType;

public class LicenseDTO extends CommonDTO {
	private IdProof idProof;
	private boolean disability;
	private boolean commercial;
	private String idProofNo;
	private Date startDate;
	private VehicleType vehicleType;
	
	public LicenseDTO() {
		super();
	}
	
	public LicenseDTO(IdProof idProof, boolean disability, boolean commercial, String idProofNo,
			VehicleType vehicleType,Date startDate) {
		
		this.idProof = idProof;
		this.disability = disability;
		this.commercial = commercial;
		this.idProofNo = idProofNo;
		this.vehicleType = vehicleType;
		this.startDate=startDate;
	}
	
	public LicenseDTO(String name, int age, AddressDTO addressDTO, long mobile, BloodGroup bloodGroup, Gender gender,
			Date dOB) {
		super(name, age, addressDTO, mobile, bloodGroup, gender, dOB);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public String toString() {
		return "LicenseDTO [idProof=" + idProof + ", disability=" + disability + ", commercial=" + commercial
				+ ", idProofNo=" + idProofNo + ", startDate=" + startDate + ", vehicleType=" + vehicleType + "]";
	}

	public IdProof getIdProof() {
		return idProof;
	}
	public void setIdProof(IdProof idProof) {
		this.idProof = idProof;
	}
	public boolean isDisability() {
		return disability;
	}
	public void setDisability(boolean disability) {
		this.disability = disability;
	}
	public boolean isCommercial() {
		return commercial;
	}
	public void setCommercial(boolean commercial) {
		this.commercial = commercial;
	}
	public String getIdProofNo() {
		return idProofNo;
	}
	public void setIdProofNo(String idProofNo) {
		this.idProofNo = idProofNo;
	}
	public VehicleType getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}
	public void setStartDate(Date startDate) {
		this.startDate=startDate;
	}
	public Date getStartDate() {
		return startDate;
	}

}
