package com.chia.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.json.JSONObject;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import com.chia.vo.ChiaChargeVO;

public class RestAPITest {

RestTemplate resTemplate;
	
	@Before
	public void setUp() {
		resTemplate = new RestTemplate();
	}
	
	@Test
	public void test(){
		fail("Not yet implemented");
	}
	
	@Ignore
	@Test
	public void testRestJosnToObject(){
		JSONObject json = new JSONObject();
		json.put("clientIp", "1.1.1.1");
		HttpHeaders headers =new HttpHeaders();
	    headers.setContentType(MediaType.APPLICATION_JSON);
	    HttpEntity<String> request=new HttpEntity<String>(json.toString(), headers);
	    ChiaChargeVO chargeVO = resTemplate.postForObject("http://localhost:8080/chia/restful/chiapay/pay",request, ChiaChargeVO.class);
		assertEquals("1.1.1.1", chargeVO.getClientIp());
	}

}
