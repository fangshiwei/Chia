package com.chia.util;

import com.pingplusplus.Pingpp;

public class ChiaPingpp extends Pingpp{

	public static void setApiKey(String apiKey){
		ChiaPingpp.apiKey = apiKey;
	}
	
	public static String getApiKey(){
		return ChiaPingpp.apiKey;
	}
	
	public static void setPrivateKeyPath(String privateKeyPath){
		String path = ChiaPingpp.class.getClassLoader().getResource(privateKeyPath).getPath();
		ChiaPingpp.privateKeyPath = path;
	}
	
	public static String getPrivateKeyPath(){
		return ChiaPingpp.privateKeyPath;
	}
}
