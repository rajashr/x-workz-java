package com.xworkz.solving.solutions;

import java.util.ArrayList;

public class DuplicateElements {

	public static <T>ArrayList<T> findDuplicates(ArrayList<T> list) {
		 //whoever call this method should pass list or reference which is of type ArrayList
		 ArrayList<T> newList=new ArrayList<T>();
		 for(T element : list) {
			 if(newList.contains(element)) {
				 newList.add(element);
				 System.out.println(element);
			 }
			 
		 }
		 return newList;
		 
	 }
	public static void main(String[] args) {
		//arrayList with duplicate values
		 ArrayList<String> emails=new ArrayList<String>();
			emails.add("hr@gmail.com");
			emails.add("contact@gmail.com");
			emails.add("rajashree@gmail.com");
			emails.add("contact@gmail.com");
			emails.add("manager@gmail.com");
			emails.add("sangamesh@gmail.com");
			emails.add("expert@gmail.com");
			emails.add("hr@gmail.com");
			emails.add("laxmi@gmail.com");
			emails.add("contact@gmail.com");
			emails.add("hr@gmail.com");
			emails.add("madhu@gmail.com");
			emails.add("contact@gmail.com");
			emails.add("anita@gmail.com");
			emails.add("work@gmail.com");
			emails.add("username@gmail.com");
			emails.add("contact@gmail.com");
			emails.add("valid@gmail.com");
			emails.add("work@gmail.com");
			
			System.out.println(emails);
			System.out.println("total elements in arrayList with duplicates "+emails.size());
			ArrayList<String> newList=findDuplicates(emails);
			System.out.println(newList);

}
}
