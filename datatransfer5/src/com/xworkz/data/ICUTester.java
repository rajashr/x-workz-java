package com.xworkz.data;
import com.xworkz.data.DTO.ICUAdmissionDTO;
import com.xworkz.data.hospital.ICU;



public class ICUTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("invoked main method");
		ICU icu=new ICU(true,1000,false);
		icu.admission("anu", "leg pain", 22, "Dr.patil");
		ICUAdmissionDTO admissionDTO=icu.getIcuAdmissionDTO();
		System.out.println(admissionDTO);
	}

}
