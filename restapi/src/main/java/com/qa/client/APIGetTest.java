package com.qa.client;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.entity.StringEntity;
import org.apache.http.util.EntityUtils;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class APIGetTest {
	public void get(String url) throws ClientProtocolException, IOException{
		RequestSpecification httpRequest=RestAssured.given();
		Response response=httpRequest.get(url);
		int statusCode=response.getStatusCode();
		System.out.println(statusCode);
	}
		//with headers
		public Response get(String url,HashMap<String, String> headersMap) throws ClientProtocolException, IOException{
			RequestSpecification httpRequest=RestAssured.given();
			for(Map.Entry<String, String> entry: headersMap.entrySet()){
				httpRequest.headers(entry.getKey(),entry.getValue());
			}
			Response response=httpRequest.get(url);
			int statusCode=response.getStatusCode();
			System.out.println(statusCode);
			return response;
			//String responseString=EntityUtils.toString(response.getEntity,"UTF-8");
		
		
//		CloseableHttpClient httpClient = HttpClients.createDefault();
//		HttpGet httpget = new HttpGet(url); //http get request
//		CloseableHttpResponse closebaleHttpResponse =  httpClient.execute(httpget); //hit the GET URL
//		
//		int statusCode=closebaleHttpResponse.getStatusLine().getStatusCode();
//		System.out.println("StatusCode" +statusCode);

}
		public Response post(String url,String entityString,HashMap<String, String> headersMap) throws UnsupportedEncodingException {
			RequestSpecification httpRequest=RestAssured.given();
			
			httpRequest.body(entityString);
			for(Map.Entry<String, String> entry: headersMap.entrySet()){
				httpRequest.headers(entry.getKey(),entry.getValue());
			}
			Response response=httpRequest.post(url);
			return response;
		}

}
