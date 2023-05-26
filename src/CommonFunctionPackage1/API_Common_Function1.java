package CommonFunctionPackage1;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;

public class API_Common_Function1 {
	//							base URI,resource,post_req_TC1 are	arguments call from req_repository
	public static int statusCode(String baseURI,String resource,String post_req_TC1) {
		RestAssured .baseURI = baseURI;
		int statusCode = given().header("Content-Type","application/json").body( post_req_TC1).when().post(resource).then().extract().statusCode();
		return statusCode;
	}	
		
		public static String responseBody(String baseURI,String resource,String post_req_TC1) {
			RestAssured.baseURI = baseURI;
			String responseBody = given().header("Content-Type","application/json").body(post_req_TC1).when().post(resource).then().extract().response().asString();
			return responseBody;			
		}
	}


