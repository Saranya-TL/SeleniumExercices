package APITESTING.COM.API;

import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.restassured.RestAssured;

public class ApiProgram1 {
	
  @Description("TC#1")
  @Test
  public void getRequest() {
	        RestAssured
	                .given()
	                .baseUri("https://restful-booker.herokuapp.com")
	                .basePath("/ping")
	                .when().get()
	                .then().statusCode(201);
	        System.out.println("TC");
	    }
 }

