package com.chia.web.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chia.vo.ChiaChargeVO;

@RestController
@RequestMapping("/chiapay")
public class ChiapayRestController {

	@RequestMapping("/pay")
	public ChiaChargeVO pay(@RequestBody ChiaChargeVO chiaChargeVO){
		return chiaChargeVO;
	}
}
