package reqres_API;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GET {
  @Test
  public static void verifyuserdata() {
	  RestAssured.baseURI="https://reqres.in/";
	  RequestSpecification httpRequest=RestAssured.given().log().all();
	  Response response=httpRequest.request(Method.GET,"https://reqres.in/api/users?page=2");
	  
	  String responsebody=response.getBody().asString();
	  int statuscode=response.statusCode();
	  
	  Assert.assertEquals(statuscode, 200);
	  System.out.println("response body is:" +responsebody);
	  System.out.println("status code is:" +statuscode);
  }
  
  @Test
    public static void singleuserdata() {
	  RestAssured.baseURI="https://reqres.in/";
	  RequestSpecification httpRequest=RestAssured.given().log().all();
	  Response response=httpRequest.request(Method.GET,"https://reqres.in/api/users/2");
	  
	  String responsebody=response.getBody().asString();
	  int statuscode=response.statusCode();
	  
	  Assert.assertEquals(statuscode, 200);
	  System.out.println("response body is:" +responsebody);
	  System.out.println("status code is:" +statuscode);
  }
	  
  @Test
  public static void singleusernotfound() {
	  RestAssured.baseURI="https://reqres.in/";
	  RequestSpecification httpRequest=RestAssured.given().log().all();
	  Response response=httpRequest.request(Method.GET,"https://reqres.in/api/users/23");
	  
	  String responsebody=response.getBody().asString();
	  int statuscode=response.statusCode();
	  
	  Assert.assertEquals(statuscode, 404);
	  System.out.println("response body is:" +responsebody);
	  System.out.println("status code is:" +statuscode);
}
	  
	  
	  
  }

