package com.chia.constant;

public enum PingppApp {
	
	ApiKey("sk_test_enfHiHyX1GuLurHuz9u5in5S"),
	AppKey("app_rX5KiLXLer9CO8er"),
	AppPrivateKeyPath("/rsa_private_key.pem");
	
	String key;
	
	PingppApp(String key){
		 this.key = key;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
	
	

	
}
