package com.xworkz.vtu;

import com.xworkz.vtu.constants.Branch;
import com.xworkz.vtu.engineer.CSEngineer;
import com.xworkz.vtu.engineer.Engineer;

public class EngTester {

	public static void main(String[] args) {
		Engineer eng=new Engineer();
		System.out.println(eng.USN);
		System.out.println(eng.branch);
		
		CSEngineer cs=new CSEngineer();
		System.out.println(cs.USN);
		System.out.println(cs.branch);

	}

}
