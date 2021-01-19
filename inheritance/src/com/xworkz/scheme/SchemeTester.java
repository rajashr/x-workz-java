package com.xworkz.scheme;

import com.xworkz.scheme.govtschemes.KarnatakaGovt;
import com.xworkz.scheme.govtschemes.UnionGovt;

public class SchemeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KarnatakaGovt ref=new KarnatakaGovt();
        UnionGovt ref2=new KarnatakaGovt();
        ref2.AtalScheme();
        ref2.AyushScheme();
        
        Number integer=new Integer(6);//cannot create object directly using Number as it is abstract class
        //if a class is marked as abstract we cant create object using a class name so to get access to parent properties need to extend class
        //use abstract with methods and class to use wuth constructor it doesnt make sense
	}

}
