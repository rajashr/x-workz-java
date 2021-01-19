package com.xworkz.DTO;

public class CustomerDtoTester {

	public static void main(String[] args) {
		
		Customerdto customerdto=new Customerdto();//new keyword always looks for constructor after object creation
		//to initialise default values or to give user defined values
		//allocates a memory 
		//creates a object with all instance variables initialised with default variables
		//now we can initialise this instance variable using set or constructor if it is parameterised constructor
		//and new keyword return a memory location and i am storing it in a reference variable
		// and even i am storing all instance var with default values in reference
		
		//customerdto.getCustomerId() : usually this return me a customer id which is of int type
		
		int no=customerdto.getCustomerId(); 
		System.out.println(no);
		System.out.println(customerdto.getContactNo()); //here i am printing all the default values
		System.out.println(customerdto.getEmail());
		System.out.println(customerdto.getName());
		customerdto.setName("rani"); //now i updated the value using setter method now i have to get it back
		System.out.println(customerdto.getName());//by using getter method
		customerdto.setContactNo(9481827790l);
		System.out.println(customerdto.getContactNo());
		customerdto.setCustomerId(6300);
		System.out.println(customerdto.getCustomerId());
		customerdto.setEmail("rajashree.xworkz@gmail.com");
		System.out.println(customerdto.getEmail());
		
		//when we use literal to initialidse instance var the instance var dont have default value
		//so when we create a object means copy of class the name will get a value we have given it
		//when we create first object that will get a value, when we create a second object it willl get a value we given
		//using literals it wont get the updated value we have given using setter method at first instance
		
		Customerdto customerdto1=new Customerdto();
		System.out.println(customerdto1.getName());
		customerdto1.setContactNo(9481827780l);
		System.out.println(customerdto1.getContactNo());
		customerdto1.setCustomerId(8421);
		System.out.println(customerdto1.getCustomerId());
		customerdto1.setEmail("rani@gmail.com");
		System.out.println(customerdto1.getEmail());
		customerdto1.setName("madhu");
		System.out.println(customerdto1.getName());
		
		
		Customerdto customerdto2=new Customerdto();
		System.out.println(customerdto2.getName());
		customerdto2.setContactNo(9485689905l);
		System.out.println(customerdto2.getContactNo());
		customerdto2.setCustomerId(5678);
		System.out.println(customerdto2.getCustomerId());
		customerdto2.setEmail("@gmail.com");
		System.out.println(customerdto2.getEmail());
		//System.out.println(customerdto.getName());
		
		
		
		

	}

}
