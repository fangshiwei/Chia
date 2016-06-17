package com.chia.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.chia.web.controller.ChiapayRestController; 

public class ChiapayRestControllerTest extends BaseControllerTest{

//	@Autowired  
//  protected WebApplicationContext wac; 
	
	@Autowired
	ChiapayRestController chiapayRestController;
	
	@Before
	public void setUp() {
//		 mockMvc = MockMvcBuilders.webAppContextSetup(wac).build(); 
		 mockMvc = MockMvcBuilders.standaloneSetup(chiapayRestController).build();
	}
	
	@Test
	public void test(){
		
	}
	
	@Test
	public void testRestPay() throws Exception{
		JSONObject json = new JSONObject();
		json.put("clientIp", "1.1.1.1");
		
		String rlt = mockMvc.perform(post("/chiapay/pay", "json")
							.contentType(MediaType.APPLICATION_JSON_UTF8)
							.content(json.toString().getBytes())
				).andExpect(status().isOk())
		.andReturn().getResponse().getContentAsString();
		
		Assert.assertEquals("{\"clientIp\":\"1.1.1.1\",\"currency\":\"cny\"}", rlt);

	}

}
