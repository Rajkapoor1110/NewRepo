package APIAutomation.APILearning;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GetMethodTc {
	
	public static void main(String[] args) {
		
		Response r=
		given()
		.contentType(ContentType.JSON)
		.when()
		.get("http://localhost:3000/APIFolks");
		System.out.println("Status code: "+ r.getStatusCode());
		System.out.println("Response Body: "+ r.asString());
		
	}

}