package com.practice.SeleniumTest;

import org.json.simple.JSONObject;

import com.google.gson.JsonObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RestAssuredGet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Response l= RestAssured.get("https://reqres.in/api/users?page=2");
      String l1=l.getStatusLine();
      int code=l.getStatusCode();
      System.out.println(l1);
      System.out.println(code);
      
      
      
      System.out.println("__________________________________________");
      RestAssured.baseURI="https://reqres.in/";
      
      
      JSONObject s= new JSONObject();
      s.put("bhuvanesh", "M");
     Response a= RestAssured.given().get("api/users?page=2");
      System.out.println(a.asPrettyString());
      
      
     int r= RestAssured.given().body(s.toJSONString()).post("/api/users").getStatusCode();
      System.out.println("last status :"+r);
      
     // RestAssured.given().port(code)
	}

}
