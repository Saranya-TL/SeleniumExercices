package ex_CRUD.GET.BDDStyle;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Lab269 {
	
	@Test
	
	public static void getRequestBDD( ) {
		RestAssured
		.given()
		.relaxedHTTPSValidation()
		.baseUri("https://api.zippopotam.us")
		.basePath("/IN/600001")
		
		.when().log().all().get()
		
		.then().log().all().statusCode(200);
	}

}
