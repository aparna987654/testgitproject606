package reqres_API;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GET_User {
  @Test
  public static void lookupcategory() {
	  RestAssured.baseURI="https://homelyfservices.com/userAPI/Swagger/index.html";
	  RequestSpecification httpRequest=RestAssured.given().log().all();
	  Response response=httpRequest.request(Method.GET,"https://homelyfservices.com/UserAPI/api/Lookup/Category");
	  
	  String responsebody=response.getBody().asString();
	  int statuscode=response.statusCode();
	  
	  Assert.assertEquals(statuscode, 200);
	  System.out.println("response body is:" +responsebody);
	  System.out.println("status code is:" +statuscode);
  }
  
  @Test
    public static void lookupCountry() {
	  RestAssured.baseURI="https://homelyfservices.com/userAPI/Swagger/index.html";
	  RequestSpecification httpRequest=RestAssured.given().log().all();
	  Response response=httpRequest.request(Method.GET,"https://homelyfservices.com/UserAPI/api/Lookup/Country");
	  
	  String responsebody=response.getBody().asString();
	  int statuscode=response.statusCode();
	  
	  Assert.assertEquals(statuscode, 200);
	  System.out.println("response body is:" +responsebody);
	  System.out.println("status code is:" +statuscode);
  }
	  
  @Test
  public static void lookupState() {
	  RestAssured.baseURI="https://homelyfservices.com/userAPI/Swagger/index.html";
	  RequestSpecification httpRequest=RestAssured.given().log().all();
	  Response response=httpRequest.request(Method.GET,"https://homelyfservices.com/UserAPI/api/Lookup/State");
	  
	  String responsebody=response.getBody().asString();
	  int statuscode=response.statusCode();
	  
	  Assert.assertEquals(statuscode, 200);
	  System.out.println("response body is:" +responsebody);
	  System.out.println("status code is:" +statuscode);
}
	  
  
  @Test
  public static void lookupcity() {
	  RestAssured.baseURI="https://homelyfservices.com/userAPI/Swagger/index.html";
	  RequestSpecification httpRequest=RestAssured.given().log().all();
	  Response response=httpRequest.request(Method.GET,"https://homelyfservices.com/UserAPI/api/Lookup/City");
	  
	  String responsebody=response.getBody().asString();
	  int statuscode=response.statusCode();
	  
	  Assert.assertEquals(statuscode, 200);
	  System.out.println("response body is:" +responsebody);
	  System.out.println("status code is:" +statuscode);
}
	  
  
  
  @Test
  public static void lookuppostcode() {
	  RestAssured.baseURI="https://homelyfservices.com/userAPI/Swagger/index.html";
	  RequestSpecification httpRequest=RestAssured.given().log().all();
	  Response response=httpRequest.request(Method.GET,"https://homelyfservices.com/UserAPI/api/Lookup/PostCode");
	  
	  String responsebody=response.getBody().asString();
	  int statuscode=response.statusCode();
	  
	  Assert.assertEquals(statuscode, 200);
	  System.out.println("response body is:" +responsebody);
	  System.out.println("status code is:" +statuscode);
}
  }

