package com.qa.tests;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.apache.http.client.ClientProtocolException;
import org.json.JSONObject;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.base.TestBase;

import com.qa.client.RestClients;
import com.qa.data.Users;

import io.restassured.response.Response;

public class PutAPITest extends TestBase{
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
	public void putApiTest() throws JsonGenerationException, JsonMappingException, IOException {
		restClient = new RestClients();
		HashMap<String, String> headersMap = new HashMap<String, String>();
		headersMap.put("content-Type", "application/json");
		

		ObjectMapper mapper = new ObjectMapper();
		Users user = new Users("Ranii", "Architect");
		
		mapper.writeValue(new File(
				"C:\\Users\\rajas\\eclipse-workspace\\xworkz\\hibernate\\restapi\\src\\main\\java\\com\\qa\\data\\userss.json"),
				user);
		String userJsonString = mapper.writeValueAsString(user);
		System.out.println(userJsonString);
		Response response=restClient.put(updateUrl, userJsonString, headersMap);
		String responseStr = response.getBody().asString();
		JSONObject responseJson = new JSONObject(responseStr);
		System.out.println("response in the form of json "+responseJson);
		int statusCode=response.getStatusCode();
		System.out.println(statusCode);
		
	}

}
