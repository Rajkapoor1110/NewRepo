package APIAutomation.APILearning;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class PostMethodUsingOrgJson_TC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		JSONObject inner1 = new JSONObject();
		inner1.put("House No", "201");
		inner1.put("Apartment Name", "Prateek Grand City");
		inner1.put("Steet Name", "Siddharth Vihar");
		inner1.put("Land Mark", "DPS School");
		inner1.put("City", "Delhi");
		inner1.put("Country", "India");
		inner1.put("Address Type", "Primary");
		
		JSONObject inner2 = new JSONObject();
		inner2.put("House No", "56");
		inner2.put("Apartment Name", "Gulshan Vivante");
		inner2.put("Steet Name", "Ganga");
		inner2.put("Land Mark", "GTB Hospital");
		inner2.put("City", "Gujrat");
		inner2.put("Country", "India");
		inner2.put("Address Type", "Secondry");
		
		JSONArray objectinner = new JSONArray();
		objectinner.put(0,inner1);
		objectinner.put(1,inner2);		
		
		
		JSONObject outer = new JSONObject();
		outer.put("FirstName", "Salman");
		outer.put("LastName", "Khan");
		outer.put("Role", "Actor");
		outer.put("id", "SKSec");
		outer.put("Address", objectinner);
		
		System.out.println(outer);
		
		Response r=
		
		given()
		.contentType(ContentType.JSON)
		.body(outer.toString())
		.when()
		.post("http://localhost:3000/APIFolks");
		System.out.println("Status Code: " + r.statusCode());
		System.out.println("Data is : " + r.asString());
		

	}

}
