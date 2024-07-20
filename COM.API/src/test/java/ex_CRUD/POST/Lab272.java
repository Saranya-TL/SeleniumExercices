package ex_CRUD.POST;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Lab272 {
	
	RequestSpecification rs = RestAssured.given();
	ValidatableResponse validatableResponse;
	Response response;
	
	@Test
	@Description("TC#1 - Non BDD Style Post Request - Create Booking")

	public void NonBDDStylePOSTPOsitive(){
		
		String BaseUri = "https://restful-booker.herokuapp.com";
		String Base_PATH = "/booking";
		String PayLoad = "{\r\n"
				+ "    \"firstname\" : \"Sunland\",\r\n"
				+ "    \"lastname\" : \"Brown\",\r\n"
				+ "    \"totalprice\" : 124,\r\n"
				+ "    \"depositpaid\" : true,\r\n"
				+ "    \"bookingdates\" : {\r\n"
				+ "        \"checkin\" : \"2024-01-01\",\r\n"
				+ "        \"checkout\" : \"2024-01-01\"\r\n"
				+ "    },\r\n"
				+ "    \"additionalneeds\" : \"Breakfast,lunch\"\r\n"
				+ "}";
		rs.relaxedHTTPSValidation();
		rs.baseUri(BaseUri);
		rs.basePath(Base_PATH);
		rs.contentType(ContentType.JSON);
		rs.body(PayLoad);
		
		
		response = rs.when().log().all().post();
		String responseString = response.asString();
		System.out.println(responseString);
		
		validatableResponse = response.then();	
		validatableResponse.statusCode(200);

		
}
	
	
	@Description("TC#1 - Non BDD Style Post Request - Create Booking")
	@Test
	public void NonBDDStylePOSTNegative(){
		
		String BaseUri = "https://restful-booker.herokuapp.com";
		String Base_PATH = "/booking";
		String PayLoad = "{}";
		rs.relaxedHTTPSValidation();
		rs.baseUri(BaseUri);
		rs.basePath(Base_PATH);
		rs.contentType(ContentType.JSON);
		rs.body(PayLoad);
		
		
		response = rs.when().log().all().post();
		String responseString = response.asString();
		System.out.println(responseString);
		
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		Assert.assertEquals(statusCode, 500);
		
		validatableResponse = response.then();	
		validatableResponse.statusCode(500);
		System.out.println(validatableResponse);
		
}
	
}
