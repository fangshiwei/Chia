package com.chia.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

public class PingppPayControllerTest extends BaseControllerTest{

RestTemplate resTemplate;
	
	@Before
	public void setUp() {
		resTemplate = new RestTemplate();
	}
	
	@Test
	public void test(){
		fail("Not yet implemented");
	}
	
	@Test
	public void testFang(){
		JSONObject json = new JSONObject();
		json.put("clientIp", "1.1.1.1");
		HttpHeaders headers =new HttpHeaders();
	    headers.setContentType(MediaType.APPLICATION_JSON);
	    HttpEntity request=new HttpEntity(json, headers);
		String ip = resTemplate.postForObject("http://localhost:8080/chia/restful/chiapay/pay",request, String.class);
		assertEquals("1.1.1.1", ip);
	}

}
