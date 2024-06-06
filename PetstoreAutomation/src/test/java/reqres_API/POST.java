package reqres_API;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class POST {
  @Test(dataProvider="userdetails")
  public static void createuserdata(String name,String job) {
	  RestAssured.baseURI="https://reqres.in/";
	  
	  RequestSpecification httpRequest=RestAssured.given().log().all();
	  
	  JSONObject requestpara=new JSONObject();
	  requestpara.put("name","John");
	  requestpara.put("job","WIPRO");
	  requestpara.put("name","Sachin");
	  requestpara.put("job","IBM");
	  
     httpRequest.headers("Content-Type","application/json");
     httpRequest.body(requestpara.toJSONString());

	  Response response=httpRequest.request(Method.POST,"https://reqres.in/api/users");
	  
	  String responsebody=response.getBody().asString();
	  int statuscode=response.statusCode();
	  
	  Assert.assertEquals(statuscode, 201);
	  System.out.println("response body is:" +responsebody);
	  System.out.println("status code is:" +statuscode);
  }
  
  @DataProvider(name="userdetails")
  
  String [][] GetUserdata() {
	  String userdata [][]= {{"name","job"},{"John","Wipro"},{"Sachin","IBM"}};
	  return (userdata);
  }
  
  
  }

