package TestClassPackage1;


import io.restassured.path.json.JsonPath;
import java.io.IOException;
import java.time.LocalDate;
import org.testng.Assert;
import org.testng.annotations.Test;
import CommonFunctionPackage1.API_Common_Function1;
import CommonFunctionPackage1.Utility_CommonFunctions1;
import RequestRepositoryPackage1.post_req_repository;
public class Post_TC_3 {
	@Test
	
	public static void execute() throws IOException{
		
	for (int i=0; i<5 ; i++)
	{
		int statusCode = API_Common_Function1.statusCode(post_req_repository.baseURI(),post_req_repository.resource(),post_req_repository.post_req_TC_2());
		if(statusCode==201)
		{
			String responseBody = API_Common_Function1.responseBody(post_req_repository.baseURI(),post_req_repository.resource(),post_req_repository.post_req_TC_2());
		Post_TC_3.validator(responseBody,statusCode);
		Utility_CommonFunctions1.evidencefilescreator("Ashish",post_req_repository.post_req_TC_2() , responseBody);
		System.out.println(responseBody);
			break;
		}
		else
		{
			System.out.println("incorrect statusCode found hence retrying the api");
		}
	}
	}
	private static void validator(String responseBody, int statusCode) throws IOException {
		
		
	
	JsonPath jspreq = new JsonPath(post_req_repository.post_req_TC_2());
	String req_name = jspreq.getString("name");
	String req_job = jspreq.getString("job");
		//parse the response body parameter
		
		JsonPath jsp = new JsonPath(responseBody);
		String res_name = jsp.getString("name");
		String res_job = jsp.getString("job");
		String res_id = jsp.getString("id");
		String res_createdAt = jsp.getString("createdAt");
		System.out.println(res_createdAt);
		
		// generate new date
		
		String expectedDate = res_createdAt.substring(0,10);
		String currentDate = LocalDate.now().toString();
		
		//validate response body
		
		Assert.assertEquals(res_name,req_name);
		Assert.assertEquals(res_job,req_job);
		Assert.assertNotNull(res_id);
		Assert.assertEquals(expectedDate,currentDate);
		
		
		}	
	}


