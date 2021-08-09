package com.qa.tests;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.json.JSONObject;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;

import com.qa.client.RestClients;

import io.restassured.response.Response;

public class GetAPITest extends TestBase {
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
	public void apiGetTest() throws ClientProtocolException, IOException {
		restClient = new RestClients();
		Response response=restClient.get(updateUrl);
		String responseStr = response.getBody().asString();
		JSONObject responseJson = new JSONObject(responseStr);
		System.out.println("response in the form of json "+responseJson);

	}

}
