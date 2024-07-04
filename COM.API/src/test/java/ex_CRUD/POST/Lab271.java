package ex_CRUD.POST;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;

public class Lab271 {
	
	
	@Test
	public void testBDDStylePositive() {
	
	String BaseUri = "https://restful-booker.herokuapp.com";
	String Base_PATH = "/booking";
	String PayLoad = "{\r\n"
			+ "    \"firstname\" : \"Jim\",\r\n"
			+ "    \"lastname\" : \"Brown\",\r\n"
			+ "    \"totalprice\" : 111,\r\n"
			+ "    \"depositpaid\" : true,\r\n"
			+ "    \"bookingdates\" : {\r\n"
			+ "        \"checkin\" : \"2018-01-01\",\r\n"
			+ "        \"checkout\" : \"2019-01-01\"\r\n"
			+ "    },\r\n"
			+ "    \"additionalneeds\" : \"Breakfast\"\r\n"
			+ "}";
	
	
	RestAssured
	.given().baseUri(BaseUri).basePath(Base_PATH)
	.contentType(ContentType.JSON).log().all().body(PayLoad)
	.when().log().all().post()
	.then().log().all().statusCode(200);

}
}
