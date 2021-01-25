package com.xworkz.programmingapti;

import com.xworkz.programmingapti.sigletondesignpattern.EagerInitSingleton;
import com.xworkz.programmingapti.sigletondesignpattern.EnuminitSingleton;
import com.xworkz.programmingapti.sigletondesignpattern.LazyinitSingleton;
import com.xworkz.programmingapti.sigletondesignpattern.StaticinitSingleton;

public class EagerTester {
    public static void main(String[] args) {
		System.out.println(EagerInitSingleton.getInstance());
		System.out.println(StaticinitSingleton.getInstance());
		System.out.println(LazyinitSingleton.getLazyinitSingleton());
		System.out.println(EnuminitSingleton.INSTANCE);
	}

}
