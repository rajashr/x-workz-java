package com.xworkz.scheme;

import com.xworkz.scheme.govtschemes.RawMaterial;
import com.xworkz.scheme.rawmaterial.CastIron;
import com.xworkz.scheme.rawmaterial.Magnesium;
import com.xworkz.scheme.rawmaterial.Wood;

public class RawMaterialTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RawMaterial ref=new CastIron();
		ref.delivery();
    ref.Manufacture();
    RawMaterial ref1=new Wood();
    ref1.delivery();
    ref1.Manufacture();
    RawMaterial ref2=new Magnesium();
    ref2.delivery();
    ref2.Manufacture();
    
	}

}
