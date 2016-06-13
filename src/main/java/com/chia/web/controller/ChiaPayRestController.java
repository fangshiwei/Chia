package com.chia.web.controller;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chia.service.PingppService;

@Controller
@RequestMapping("/pingpp")
public class ChiaPayRestController {

	@Autowired
	PingppService pingppService;
	
	@RequestMapping("/pay")
	@ResponseBody
	public String pay(String channel){
		
		String charge = pingppService.pay(channel);
		JSONObject josnObject = new JSONObject();
		josnObject.put("charge", charge);
		return josnObject.toString();
	}
	
	
	@RequestMapping("/refund")
	@ResponseBody
	public String refund(String channel){
		
		/**
		 * @TODO
		 * 
		 */
		return null;
	}
	
	
}
