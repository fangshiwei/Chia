package com.chia.web.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chia.vo.ChiaChargeVO;

@RestController
@RequestMapping("/chiapay")
public class PingppPayController {
	
	@RequestMapping("/pay")
	public String pay(@RequestBody ChiaChargeVO chiaChargeVO){
		System.out.println(chiaChargeVO.getClientIp());
		return chiaChargeVO.getClientIp();
	}
	
}
