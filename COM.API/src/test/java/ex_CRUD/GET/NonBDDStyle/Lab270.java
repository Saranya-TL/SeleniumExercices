package ex_CRUD.GET.NonBDDStyle;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import groovy.util.logging.Log;


public class Lab270 {

	RequestSpecification rs = RestAssured.given();
	
	@Test 

	public void getRequestNonBDDStyle(){
		rs.relaxedHTTPSValidation();
		rs.baseUri("https://api.zippopotam.us");
		rs.basePath("/IN/600001");
		rs.when().log().all().get();
		rs.then().log().all().statusCode(200);
		
		
	}
}
