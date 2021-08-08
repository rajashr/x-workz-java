package com.qa.client;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetAPITest {
	public void get(String url) throws ClientProtocolException, IOException{
		RequestSpecification httpRequest=RestAssured.given();
		Response response=httpRequest.get(url);
//		CloseableHttpClient httpClient = HttpClients.createDefault();
//		HttpGet httpget = new HttpGet(url); //http get request
//		CloseableHttpResponse closebaleHttpResponse =  httpClient.execute(httpget); //hit the GET URL
//		
//		int statusCode=closebaleHttpResponse.getStatusLine().getStatusCode();
//		System.out.println("StatusCode" +statusCode);

}
}
