package com.xworkz.solving.solutions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

public class TesterForCollection {

	public static void main(String[] args) {
		
		Collection<String> emails=new ArrayList<String>();
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
		System.out.println(emails.toString());
		System.out.println("total elements in arrayList with duplicates "+emails.size());
		
		/*
		 * converting arrayList to set to avoid duplicates
		 */
		
		Set<String> converted=new LinkedHashSet<>();
		converted.addAll(emails);
		emails.clear();
		emails.addAll(converted);
		System.out.println(converted);
		System.out.println("total elements in arrayList without duplicates "+converted.size());
		

	}

}
