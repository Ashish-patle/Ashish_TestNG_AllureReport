package RequestRepositoryPackage1;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.annotations.BeforeTest;

import CommonFunctionPackage1.Utility_CommonFunctions1;

public class post_req_repository {
	@BeforeTest
	public static String baseURI() {
		String baseURI = "https://reqres.in/";
		return baseURI;
	}
	public static String resource() {
		String resource = "/api/users";
		return resource;
	}
	
		public static String post_req_TC_1() throws IOException {
			ArrayList<String> data=Utility_CommonFunctions1.readdataexcel("Post_Test_Data","Post_TC_1");
			String req_name=data.get(1);
			String req_job=data.get(2);
		
			String requestBody = "{\r\n"
					+ "    \"name\": \""+req_name+"\",\r\n"
					+ "    \"job\": \""+req_job+"\"\r\n"
					+ "}";
			return requestBody;	
	
	}
		public static String post_req_TC_2() throws IOException {
			ArrayList<String> data=Utility_CommonFunctions1.readdataexcel("Post_Test_Data","Post_TC_2");
			String req_name=data.get(1);
			String req_job=data.get(2);
		
			String requestBody = "{\r\n"
					+ "    \"name\": \""+req_name+"\",\r\n"
					+ "    \"job\": \""+req_job+"\"\r\n"
					+ "}";
			return requestBody;		

			}
		public static String post_req_TC_3() throws IOException {
			ArrayList<String> data=Utility_CommonFunctions1.readdataexcel("Post_Test_Data","Post_TC_3");
			String req_name=data.get(1);
			String req_job=data.get(2);
		
			String requestBody = "{\r\n"
					+ "    \"name\": \""+req_name+"\",\r\n"
					+ "    \"job\": \""+req_job+"\"\r\n"
					+ "}";
			return requestBody;	
		}
		public static String post_req_TC_4() throws IOException {
			ArrayList<String> data=Utility_CommonFunctions1.readdataexcel("Post_Test_Data","Post_TC_4");
			String req_name=data.get(1);
			String req_job=data.get(2);
		
			String requestBody = "{\r\n"
					+ "    \"name\": \""+req_name+"\",\r\n"
					+ "    \"job\": \""+req_job+"\"\r\n"
					+ "}";
			return requestBody;	
		}
}
