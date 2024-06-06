package reqres_API;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class POST_TRY {
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

