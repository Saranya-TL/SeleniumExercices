package ex_CRUD.DELETE;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class Lab275 {

    RequestSpecification r =RestAssured.given();
    Response response;
    ValidatableResponse vr;
    String token = "34cad9e472de8c0";
    String bookingid = "7365";

    
	String BaseUri = "https://restful-booker.herokuapp.com";
	String Base_PATH = "/booking";
	
	@Test
    public void testDeleteREQUESTNonBDD(){
        String BASE_PATH_UPDATED = BaseUri+"/"+ bookingid;
        System.out.println(BASE_PATH_UPDATED);


        r.baseUri(BaseUri);
        r.basePath(BASE_PATH_UPDATED);
        r.contentType(ContentType.JSON);
        r.cookie("token",token);
        r.log().all();

        response = r.when().log().all().delete();

        vr = response.then().log().all();
        vr.statusCode(201);
	}

	
}
