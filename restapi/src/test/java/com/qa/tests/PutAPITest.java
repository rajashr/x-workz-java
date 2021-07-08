package com.qa.tests;

import java.io.File;
import java.io.IOException;

import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.qa.base.TestBase;
import com.qa.client.RestClient;
import com.qa.data.Users;

public class PutAPITest extends TestBase{
	TestBase testBase;
	String serviceUrl;
	String apiUrl;
	String url;
	RestClient restClient;
	CloseableHttpResponse closebaleHttpResponse;
	@BeforeMethod
	public void setUp() throws ClientProtocolException, IOException{
		testBase = new TestBase();
		serviceUrl = prop.getProperty("URL");
		apiUrl = prop.getProperty("serviceURL");
		//https://reqres.in/api/users
		
		url = serviceUrl + apiUrl;
		
	}
	@Test
	public void putAPITest() throws ParseException, IOException {

		ObjectMapper mapper=new ObjectMapper();
		Users users=new Users("Sangamesh", "Software E Engineer");
		
		mapper.writeValue(new File("\\Users\\rajas\\eclipse-workspace\\xworkz\\hibernate\\restapi\\src\\main\\java\\com\\qa\\data\\Userss.json"), users); 
		//give the json file path here in resultFile
		
		String usersJsonInString=mapper.writeValueAsString(users);
		System.out.println(usersJsonInString);
		
		closebaleHttpResponse=restClient.put(url, usersJsonInString);
		
		//Verifying status code
		int statusCode=closebaleHttpResponse.getStatusLine().getStatusCode();
		Assert.assertEquals(statusCode, testBase.RESPONSE_STATUS_CODE_200);
		
		//verifying jsonString
		String responseString=EntityUtils.toString(closebaleHttpResponse.getEntity(), "UTF-8");
		
		JSONObject responseJson=new JSONObject(responseString);
		System.out.println("REsponse in the form of JSon : "+ responseJson);
		
	}

}
