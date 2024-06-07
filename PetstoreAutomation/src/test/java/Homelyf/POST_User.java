package Homelyf;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class POST_User {
  @Test(dataProvider="Login")
  public static void login(String name,String job) {
	  RestAssured.baseURI="https://homelyfservices.com/UserAPI/Swagger/index.html";
	  
	  RequestSpecification httpRequest=RestAssured.given().log().all();
	  
	  JSONObject requestpara=new JSONObject();
	  requestpara.put("emailAddress","vaxa3680@cgbird.com");
	  requestpara.put("mobileNumber","9810986543");
	  requestpara.put("password","P@Testing1");
	  requestpara.put("type","v");
	  requestpara.put("location","Pune");
	  
     httpRequest.headers("Content-Type","application/json");
     httpRequest.body(requestpara.toJSONString());

	  Response response=httpRequest.request(Method.POST,"https://homelyfservices.com/UserAPI/api/Account/SendSMSOTP");
	  
	  String responsebody=response.getBody().asString();
	  int statuscode=response.statusCode();
	  
	  Assert.assertEquals(statuscode, 200);
	  System.out.println("response body is:" +responsebody);
	  System.out.println("status code is:" +statuscode);
  }
  
  @DataProvider(name="Login")
  
  String [][] GetUserdata() {
	  String userdata [][]= {{"emailAddress","vaxa3680@cgbird.com"},{"mobileNumber","9810986543"},{"password","P@Testing1"},{"type","v"},{"location","Pune"}};
	  return (userdata);
  }
  
  
  
  @Test(dataProvider="EmailOTP")
  public static void sendEmailOTP(String name,String job) {
	  RestAssured.baseURI="https://homelyfservices.com/userAPI/Swagger/index.html";
	  
	  RequestSpecification httpRequest=RestAssured.given().log().all();
	  
	  JSONObject requestpara=new JSONObject();
	  requestpara.put("emailAddress","vaxa3680@cgbird.com");
	  
     httpRequest.headers("Content-Type","application/json");
     httpRequest.body(requestpara.toJSONString());

	  Response response=httpRequest.request(Method.POST,"https://homelyfservices.com/UserAPI/api/Account/SendEmailOTP");
	  
	  String responsebody=response.getBody().asString();
	  int statuscode=response.statusCode();
	  
	  Assert.assertEquals(statuscode, 200);
	  System.out.println("response body is:" +responsebody);
	  System.out.println("status code is:" +statuscode);
  }
  
  @DataProvider(name="EmailOTP")
  
  String [][] EOTP() {
	  String Eotp [][]= {{"emailAddress","vaxa3680@cgbird.com"}};
	  return (Eotp);
  }
 
  
  
  
  @Test(dataProvider="SendSMSOTP")
  public static void sendSMSOTP(String name,String job) {
	  RestAssured.baseURI="https://homelyfservices.com/userAPI/Swagger/index.html";
	  
	  RequestSpecification httpRequest=RestAssured.given().log().all();
	  
	  JSONObject requestpara=new JSONObject();
	  requestpara.put("mobileNumber","9810986543");
	  
     httpRequest.headers("Content-Type","application/json");
     httpRequest.body(requestpara.toJSONString());

	  Response response=httpRequest.request(Method.POST,"https://homelyfservices.com/UserAPI/api/Account/SendSMSOTP");
	  
	  String responsebody=response.getBody().asString();
	  int statuscode=response.statusCode();
	  
	  Assert.assertEquals(statuscode, 200);
	  System.out.println("response body is:" +responsebody);
	  System.out.println("status code is:" +statuscode);
  }
  
  @DataProvider(name="SendSMSOTP")
  
  String [][] SMS() {
	  String sms [][]= {{"mobileNumber","9810986543"}};
	  return (sms);
  }
  
         
  
  @Test(dataProvider="VerifySMS")
  public static void VerifySMS(String name,String job) {
	  RestAssured.baseURI="https://homelyfservices.com/userAPI/Swagger/index.html";
	  
	  RequestSpecification httpRequest=RestAssured.given().log().all();
	  
	  JSONObject requestpara=new JSONObject();
	  requestpara.put("mobileNumber","9810986543");
	  requestpara.put("otp","2345");
	  
     httpRequest.headers("Content-Type","application/json");
     httpRequest.body(requestpara.toJSONString());

	  Response response=httpRequest.request(Method.POST,"https://homelyfservices.com/UserAPI/api/Account/VerifySMS");
	  
	  String responsebody=response.getBody().asString();
	  int statuscode=response.statusCode();
	  
	  Assert.assertEquals(statuscode, 200);
	  System.out.println("response body is:" +responsebody);
	  System.out.println("status code is:" +statuscode);
  }
  
  @DataProvider(name="VerifySMS")
  
  String [][] VerifySMS() {
	  String Verifysms [][]= {{"mobileNumber","9810986543"},{"otp","2345"}};
	  return (Verifysms);
  }
  
  
  
  }

