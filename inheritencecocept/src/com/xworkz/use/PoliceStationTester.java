package com.xworkz.use;

import com.xworkz.use.DTO.PoliceStationDTO;
import com.xworkz.use.uses.RailwayStationDTO;


public class PoliceStationTester {

	public static void main(String[] args) {
		PoliceStationDTO ref=new PoliceStationDTO("station", 7, "MG road");
		//System.out.println(ref);//implicit
		
		System.out.println(ref.toString());//explicit
		System.out.println(ref.hashCode());
		
		//int number=ref.hashCode();
        //System.out.println(number);
		
        PoliceStationDTO ref1=new PoliceStationDTO("Upparapet", 9, "navarang");
        //System.out.println(ref1);
        
        System.out.println(ref1.toString());
        System.out.println(ref1.hashCode());
        
        PoliceStationDTO ref2=new PoliceStationDTO("station", 3, "jayaNagar");
        System.out.println(ref2.toString());
        System.out.println(ref2.hashCode());
        
        //equality
        
        boolean equal=ref.equals(ref2);//not equal references then we start comparing now and now name is also not same 
        //then it will return false
        System.out.println(equal);
        
       
        RailwayStationDTO dtopolice=new RailwayStationDTO("yashvanth",0,"navanagar");
        RailwayStationDTO dtorailway=new RailwayStationDTO("yashvanthpura",5,"YPR");
     
        //still two objects not equal as they returned true but the hashcodes not yet same
        System.out.println(dtorailway.equals(dtopolice));
        System.out.println(dtopolice.hashCode());
        System.out.println(dtorailway.hashCode());
        System.out.println(System.identityHashCode(dtorailway));
        System.out.println(System.identityHashCode(dtopolice));
        
        PoliceStationDTO police=new PoliceStationDTO("yashvanthpura",0,"block");
        System.out.println(police.equals(dtorailway));
        System.out.println(police.hashCode());
        System.out.println(dtorailway.hashCode());
        
       
       
	}

}
