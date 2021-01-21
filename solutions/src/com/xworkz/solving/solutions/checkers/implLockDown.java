package com.xworkz.solving.solutions.checkers;

public class implLockDown implements Stategovt{
	public String wearMask() {
		String mask="yes";
		System.out.println("invoked wearMask");
		return mask;
	}
	
	public void add() {
		System.out.println("invoked add");
	}
	public void contains() {
		System.out.println("invoked contains");
	}

}
