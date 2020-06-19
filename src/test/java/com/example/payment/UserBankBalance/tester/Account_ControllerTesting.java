package com.example.payment.UserBankBalance.tester;

import org.json.simple.JSONObject;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class Account_ControllerTesting {


	
	
	/*providing application port no*/
	
	@Before
	public void setUp() throws Exception {
	    RestAssured.port = 8081;
	}
	
	
	
	@Test
	public void retrieveSingleUser() throws Exception {
		
		Response resp = RestAssured.get("/Account/1837440");
		System.out.println(resp.getStatusCode());
		System.out.println(resp.asString());
		System.out.println(resp.getTime());
	
		Assert.assertEquals(200, resp.getStatusCode());
	
	}
	
	
	@Test
	public void post_method()throws Exception{
		
		RequestSpecification request =   RestAssured.given();
		request.header("Content-Type","application/json");
		
		JSONObject json = new JSONObject();
		json.put("account_id",102);
		json.put("account_type","savings");
		json.put("account_balance",15287);
		
		request.body(json.toJSONString());
		
		Response response=request.post("/Account");
		Assert.assertEquals(200, response.getStatusCode());
		
	}
	
	
	@Test
	public void put_method()throws Exception{
		
		RequestSpecification request =   RestAssured.given();
		request.header("Content-Type","application/json");
		
		JSONObject json = new JSONObject();
		json.put("account_id",1837440);
		json.put("account_type","savings");
		json.put("account_balance",500000);
		
		request.body(json.toJSONString());
		
		Response response=request.put("/Account/update");
		Assert.assertEquals(200, response.getStatusCode());
		
	}
	
}
