package com.qa.tests;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.base.TestBase;
import com.qa.client.APIGetTest;
import com.qa.client.RestClient;
import com.qa.data.Users;

import io.restassured.http.Headers;
import io.restassured.response.Response;

public class GetAPITest extends TestBase {
	TestBase testBase;
	String serviceUrl;
	String apiUrl;
	String url;
	APIGetTest another;
	Response response;
//	RestClient restClient;
//	CloseableHttpResponse closebaleHttpResponse;

	@BeforeMethod
	public void setUp() throws ClientProtocolException, IOException {
		testBase = new TestBase();
		serviceUrl = prop.getProperty("URL");
		apiUrl = prop.getProperty("serviceURL");
		// https://reqres.in/api/users

		url = serviceUrl + apiUrl;

	}

//	@Test
//	public void getAPITest() throws ClientProtocolException, IOException
//	{
//		restClient=new RestClient();
//		restClient.get(url);
//		
//	}
	@Test(priority = 1)
	public void apiGetTest() throws ClientProtocolException, IOException {
		another = new APIGetTest();
		another.get(url);

	}

	@Test(priority = 2)
	public void apiGetWithHeaders() throws ClientProtocolException, IOException {
		another = new APIGetTest();
		HashMap<String, String> headersMap = new HashMap<String, String>();
		headersMap.put("content-Type", "application/json");

		response = another.get(url, headersMap);
		// String
		// responseString=EntityUtils.toString(response.getBody().asString(),"UTF-8");
		String responseStr = response.getBody().asString();
		JSONObject responseJson = new JSONObject(responseStr);
		System.out.println(responseJson);

	}

	@Test
	public void postApiTest() throws JsonGenerationException, JsonMappingException, IOException {
		another = new APIGetTest();
		HashMap<String, String> headersMap = new HashMap<String, String>();
		headersMap.put("content-Type", "application/json");

		ObjectMapper mapper = new ObjectMapper();
		Users user = new Users("Rani", "Senior Software Engineer");

		// Converting object to json file conversion
		mapper.writeValue(new File(
				"C:\\Users\\rajas\\eclipse-workspace\\xworkz\\hibernate\\restapi\\src\\main\\java\\com\\qa\\data\\users.json"),
				user);

		// converting object to jsonSTring
		String userJsonString = mapper.writeValueAsString(user);
		System.out.println(userJsonString);
		another.post(url, userJsonString, headersMap);

	}
}
