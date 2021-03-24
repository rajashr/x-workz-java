package com.xworkz.router;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RouterTester {
	public static void main(String[] args) {
		
		System.out.println(" jvm invoked main method");
		String springXml="spring.xml";
		ApplicationContext container=new ClassPathXmlApplicationContext(springXml);
		Router router=container.getBean(Router.class);
		router.increaseInternetSpeed();
		router.distributeNetworkWIFISignals();
		router.connectToDifferentNetworks();
	}

}
