package com.qa.client;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.client.ClientProtocolException;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestClients {
	//Get
	public Response get(String url) throws ClientProtocolException, IOException{
		RequestSpecification httpRequest=RestAssured.given();
		Response response=httpRequest.get(url);
		int statusCode=response.getStatusCode();
		System.out.println(statusCode);
		return response;
	}
	//Get
	public Response get(String url,HashMap<String, String> headersMap) throws ClientProtocolException, IOException{
		RequestSpecification httpRequest=RestAssured.given();
		for(Map.Entry<String, String> entry: headersMap.entrySet()){
			httpRequest.headers(entry.getKey(),entry.getValue());
		}
		Response response=httpRequest.get(url);
		int statusCode=response.getStatusCode();
		System.out.println(statusCode);
		return response;
	}
	
	//post

	public Response post(String url,String entityString,HashMap<String, String> headersMap) throws UnsupportedEncodingException {
		RequestSpecification httpRequest=RestAssured.given();
		
		httpRequest.body(entityString);
		for(Map.Entry<String, String> entry: headersMap.entrySet()){
			httpRequest.headers(entry.getKey(),entry.getValue());
		}
		Response response=httpRequest.post(url);
		return response;
	}
	
	//put
	public Response put(String url,String entityString, HashMap<String, String> headersMap) {
		RequestSpecification httpRequest=RestAssured.given();
		httpRequest.body(entityString);
		for(Map.Entry<String, String> entry: headersMap.entrySet()){
			httpRequest.headers(entry.getKey(),entry.getValue());
		}
		Response response=httpRequest.put(url);
		return response;
		
	}
	
	//delete
	public void delete(String url) {
		RequestSpecification httpRequest=RestAssured.given();
		Response response=httpRequest.delete(url);
		int statusCode=response.getStatusCode();
		System.out.println(statusCode);
		
		
	}
	

}
