package com.chia.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.chia.constant.PingppPayChannel;
import com.chia.service.PingppService;
import com.google.gson.Gson;
import com.pingplusplus.exception.PingppException;
import com.pingplusplus.model.Charge;

@Service
public class PingppServiceImpl implements PingppService {

	@Override
	public String pay(String channel) {

		Map<String, Object> chargeParams = new HashMap<String, Object>();
		chargeParams.put("order_no", "chia" + System.currentTimeMillis());
		chargeParams.put("amount", 100);
		Map<String, String> app = new HashMap<String, String>();
		app.put("id", "app_rX5KiLXLer9CO8er");
		chargeParams.put("app", app);
		chargeParams.put("channel", channel);
		chargeParams.put("currency", "cny");
		chargeParams.put("client_ip", "127.0.0.1");
		chargeParams.put("subject", "Your Subject");
		chargeParams.put("body", "Your Body");
		Map<String, String> extra = new HashMap<String, String>();
		if(PingppPayChannel.ALIPAY_PC_DIRECT.getChannel().equalsIgnoreCase(channel)){
			extra.put("success_url", "http://www.shiwei.tk/paysuccess.html");
		}else if(PingppPayChannel.UPACP_PC.getChannel().equalsIgnoreCase(channel)){
			extra.put("result_url", "http://www.shiwei.tk/paysuccess.html");
		}else if(PingppPayChannel.WX_PUB_QR.getChannel().equalsIgnoreCase(channel)){
			extra.put("product_id", "chia111111");
		}
		chargeParams.put("extra", extra);
		
		try {
			Charge charge = Charge.create(chargeParams);
			String chargeString = charge.toString();
			System.out.print(chargeString);
			return chargeString;
		} catch (PingppException e) {
			e.printStackTrace();
		} 

		return null;
	}

	@Override
	public String refund(String channel) {
		// TODO Auto-generated method stub
		Gson gson = new Gson();
		
		return gson.toString();
	}

}
