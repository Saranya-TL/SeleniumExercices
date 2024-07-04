package ex_CRUD.PUT;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;

public class Lab273 {
	
	RequestSpecification rs = RestAssured.given();
	Response response;
	ValidatableResponse vr;
	
	String baseURL = "https://restful-booker.herokuapp.com";
	String basePath = "/booking";
	String bookingid = "72";
	String tokenId = "35757bf5dcec142";
	
	@Test
	
	public void testPUTRequestNonBDD() {
		String basePath_Updated =  basePath + "/" + bookingid;
		
		String PayLoad = "{\r\n"
				+ "    \"firstname\" : \"Saranya\",\r\n"
				+ "    \"lastname\" : \"Devi\",\r\n"
				+ "    \"totalprice\" : 111,\r\n"
				+ "    \"depositpaid\" : true,\r\n"
				+ "    \"bookingdates\" : {\r\n"
				+ "        \"checkin\" : \"2018-01-01\",\r\n"
				+ "        \"checkout\" : \"2019-01-01\"\r\n"
				+ "    },\r\n"
				+ "    \"additionalneeds\" : \"Breakfast\"\r\n"
				+ "}";
	
	rs.relaxedHTTPSValidation();
	rs.baseUri(baseURL);
	rs.basePath(basePath_Updated);
	rs.contentType(ContentType.JSON);
	rs.cookie("Token", tokenId);
	rs.body(PayLoad).log().all();
	
	response = rs.when().log().all().put();
	
	vr = response.then().log().all();
	vr.statusCode(200);
	vr.body("firstname",Matchers.equalTo("Saranya"));
	vr.body("firstname",Matchers.equalTo("Devi"));
	
	
	
	
	
	
	
	}
}
