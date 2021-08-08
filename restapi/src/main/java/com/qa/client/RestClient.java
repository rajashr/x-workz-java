package com.qa.client;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

import com.fasterxml.jackson.databind.ObjectReader;

public class RestClient {
	
		public void get(String url) throws ClientProtocolException, IOException{
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpGet httpget = new HttpGet(url); //http get request
		CloseableHttpResponse closebaleHttpResponse =  httpClient.execute(httpget); //hit the GET URL
		
		int statusCode=closebaleHttpResponse.getStatusLine().getStatusCode();
		System.out.println("StatusCode" +statusCode);
		
		String respStr= EntityUtils.toString(closebaleHttpResponse.getEntity(), "UTF-8");
		
		JSONObject respJson= new JSONObject(respStr);
		System.out.println("Response in JSON form :"+ respJson);
		
			
		}

		//Post
		public CloseableHttpResponse post(String url, String entityString,HashMap<String, String> headerMap) throws ClientProtocolException, IOException {
			CloseableHttpClient httpClient = HttpClients.createDefault();
			HttpPost httppost=new HttpPost(url);
			httppost.setEntity(new StringEntity(entityString));
			
			for(Map.Entry<String, String> entry : headerMap.entrySet()) { //headers
				httppost.addHeader(entry.getKey(), entry.getValue());
				
				
			}
			//execute httpClient post request
			CloseableHttpResponse closeableHttpResponse=  httpClient.execute(httppost);
			return closeableHttpResponse;
			
			
		}
		
		
		

}
