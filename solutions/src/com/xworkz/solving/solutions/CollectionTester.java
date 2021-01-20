package com.xworkz.solving.solutions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionTester {

	public static void main(String[] args) {
		
		String cadbury="Eclairs";
		String nestle="KitKat";
		String parle="Kiss me";
		String Hersheys="kiss";
		String amul="Dark chocolate";
		int ref=5;
		boolean ref1=true;
		float ref2=678.88f;
		//Home home;
		Collection chocolates=new ArrayList();//using parent type created object
		//List ref=new ArrayList();
		chocolates.add(amul);
		chocolates.add(ref);
		chocolates.add(ref1);
		int totalElements=chocolates.size();
		System.out.println(totalElements);
		System.out.println(chocolates.size());
		chocolates.add(ref2);
		chocolates.add(78);
		System.out.println(chocolates.size());
		chocolates.remove(ref2);
		System.out.println(chocolates.size());
		
		boolean added=false;
		 added=chocolates.add(nestle);//this add method return me a boolean
		System.out.println(added);
		added=chocolates.add(67);
		System.out.println(added);
		
		boolean removed=false;
		removed=chocolates.remove(99);
		System.out.println(removed);
		removed=chocolates.remove(67);
		System.out.println(removed);
		
		Iterator it=chocolates.iterator();
		//in iterator there are some methods and now i am using it without knowing how it is implemented in ArrayList 
		
		Iterator iterator=chocolates.iterator();
		while(iterator.hasNext())
		{
			System.out.println("element present");
			Object str=iterator.next();
			System.out.println(str);
		}
		
		

	}

}
