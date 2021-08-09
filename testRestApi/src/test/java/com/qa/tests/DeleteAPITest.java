package com.qa.tests;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;

import com.qa.client.RestClients;

public class DeleteAPITest extends TestBase{
	TestBase testBase;
	String serviceUrl;
	String apiUrl;
	String url;
	String updateUrl;
	RestClients restClient;

	@BeforeMethod
	public void setUp() throws ClientProtocolException, IOException {
		testBase = new TestBase();
		serviceUrl = prop.getProperty("URL");
		apiUrl = prop.getProperty("serviceURL");
		id = prop.getProperty("id");
		// https://reqres.in/api/users

		url = serviceUrl + apiUrl;
		updateUrl = serviceUrl + apiUrl + id;

	}
	
	@Test
	public void deleteAPITest() {
		restClient = new RestClients();
		restClient.delete(updateUrl);
	}

}
