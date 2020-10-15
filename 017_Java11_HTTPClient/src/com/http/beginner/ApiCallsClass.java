package com.http.beginner;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Version;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class ApiCallsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HttpClient client = HttpClient.newHttpClient();
		String base_api_url = "http://dummy.restapiexample.com/api/v1";
		String rest_endpoint = "/employees";
		String url = base_api_url + rest_endpoint;
		//http://dummy.restapiexample.com/api/v1/employees
		
		//get all employees
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
		HttpResponse response;
		try {
			response = client.send(request, BodyHandlers.ofString());
			System.out.println(response.body());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//get employee with id
	    rest_endpoint = "/employee/24";
	    url = base_api_url + rest_endpoint;
	    //http://dummy.restapiexample.com/api/v1/employee/22
		
	    request = HttpRequest.newBuilder().uri(URI.create(url)).build();
		System.out.println(url);
		try {
			response = client.send(request, BodyHandlers.ofString());
			System.out.println(response.body());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//delete request!
		rest_endpoint = "/delete/20";
	    url = base_api_url + rest_endpoint;
	    //http://dummy.restapiexample.com/api/v1/delete/22
		
	    request = HttpRequest.newBuilder().uri(URI.create(url)).DELETE().build();
		System.out.println(url);
		try {
			response = client.send(request, BodyHandlers.ofString());
			System.out.println(response.body());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//add employee - post request
		rest_endpoint = "/create";
	    url = base_api_url + rest_endpoint;
	    //http://dummy.restapiexample.com/api/v1/create
		String requestBodyString = "{\"name\":\"Prafful Daga\",\"salary\":\"8888\",\"age\":\"31\"}";
	    
	    request = HttpRequest.newBuilder().uri(URI.create(url)).POST(BodyPublishers.ofString(requestBodyString)).build();
		System.out.println(url);
		try {
			response = client.send(request, BodyHandlers.discarding());
			System.out.println(response.statusCode());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
