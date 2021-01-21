package com.xworkz.solving.solutions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestForCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//collection is mainly used for grouping objects and provide methods to manipulate
		//how to add objects in collection
		
		//String is a class in java and can be used as object and represents a sequence of characters
		//anything we write in java is class(out of which we can create a object)
//	 Integer ref=5;
//	 Integer ref1=6;
//	 int collect=8;
//	 Double  ref5=867.088;
//	 
//	 Collection numbers=new ArrayList();
//		//lets add object into the collection by using add method
//	 //numbers is collection now
//	 numbers.add(ref);
//	 numbers.add(collect);//by this we know anything we write in java is object
//	 numbers.add(ref1);
//	 numbers.add(89);
//	 //now if add method returns true then the obj is added into the collection
//	 boolean added=false;
//	  added=numbers.add(ref1);
//	 System.out.println(added);
//	 added=numbers.add(ref5);
//	 System.out.println(added);
//	 added=numbers.add(76);
//	 System.out.println(added);
		
		//*****************************************************
		String cadbury="dairymilk";
		String nestle="kitakat";
		String campco="MilkyBar";
		String amul="Dark chocolate";
		String parle="kiss me";
		
		//we are having certain objects here lets add group them we are making use collection for that
		
		Collection chocolates=new ArrayList();
		boolean added=false;
		added=chocolates.add(cadbury);
		System.out.println(added);
		added=chocolates.add(parle);
		System.out.println(added);
		added=chocolates.add(nestle);
		System.out.println(added);
		added=chocolates.add(campco);
		System.out.println(added);
		//even if we do like this we add anything add method return true bcoz it takes argument which is of type OBJECT
		added=chocolates.add(55);
		System.out.println(added);
		//to add objects in collection we are using add method from collection and returns boolean
		//return true if object is  added otherwise returns false
		System.out.println(" total elements before removing  " + chocolates.size());
		
		System.out.println("********************************");
		//now lets know how to remove elements(after getting added into the collection objects becomes elements) from collcetion
		boolean removed=false;
		removed=chocolates.remove(cadbury); //remove method return boolean true if object removed and false if object not removed from collection
		System.out.println(removed);
		removed=chocolates.remove(99);//return false bcoz element not present in the collection so it is not removed
		//remove method removes only elements which are there in the collection
		System.out.println(removed);
		System.out.println(" total elements after removing  " + chocolates.size());
		//to check whether particular element there in the collection or not we use contains method
		boolean present=false;
		present = chocolates.contains(nestle);
		System.out.println(present);
		
		present =chocolates.contains(66);
		System.out.println(present);//it returns me a boolean if object (to be more specific if ref i am passing as arg there in the collection it returns true)
		  System.out.println(chocolates.toString());
		 System.out.println("***********************************");
		 System.out.println("lets add element which is null");
		 String ref=null;
		 added=chocolates.add(ref);
		 System.out.println(added);
		 //collection has method add which is implemented in arrayList as they want we do not worry about the implementation we just use functionality to add objects in collection
		 //collections add method is implemented in arrayList in such a way that it null as object even we can add null in collection
		//earlier when we used to pass the null we were checking for NPE
		 //but even when we add null to collection we are not checking for NpE for certain methods like null.toString
		 //bcoz internally they may be dng this as below when they implemented arrayList
		 
		 
		 if(ref!=null) {
			System.out.println(ref.toString());
			//return true;
		}else {
			//retrun false;
		}
		 System.out.println("total elements in collection after adding null  "+chocolates.size());
		 //even though i passing null into collection i am not getting NPE when we pass we get NPE not expected to come but it comes
		 
		 System.out.println(chocolates);//so to avoid that we used to check for null but here even we are passing null not checking for NPE so internally ArrayList taking care of all this
		 System.out.println(chocolates.toString()); //converted collections to string ** whenever we print reference in java it internally calls toString method
		 System.out.println(chocolates.toArray()); //converted collection array and start looping it
		Object[] convertedchocoltaes=chocolates.toArray(); //toarray returns object array 
		 for(int i=0;i<convertedchocoltaes.length;i++) {
			 System.out.println(convertedchocoltaes[i]);
		 }//this for loop is not object oriented
		 //lets use iterator to loop the objects
		 //so collction has given a method known as iterator to loop
		 Iterator obj=chocolates.iterator();
		 System.out.println(chocolates.iterator());
	
		 
	     
		 
		  
		  
		
		

	}

}
