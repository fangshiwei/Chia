package com.chia.constant;

public enum PingppPayChannel {
	ALIPAY("alipay", "支付宝手机支付"),
	ALIPAY_WAP("alipay_wap","支付宝手机网页支付"),
	ALIPAY_QR("alipay_qr","支付宝扫码支付"),
	ALIPAY_PC_DIRECT("alipay_pc_direct","支付宝PC网页支付"),
	BFB("bfb","百度钱包移动快捷支付"),
	BFB_WAP("bfb_wap","百度钱包手机网页支付"),
	UPACP("upacp","银联全渠道支付（2015年1月1日后的银联新商户使用。若有疑问，请与Ping++或者相关的收单行联系）"),
	UPACP_WAP("upacp_wap","银联全渠道手机网页支付（2015年1月1日后的银联新商户使用。若有疑问，请与Ping++或者相关的收单行联系）"),
	UPACP_PC("upacp_pc","银联PC网页支付"),
	CP_B2B("cp_b2b","银联企业网银支付"),
	WX("wx","微信支付"),
	WX_PUB("wx_pub","微信公众账号支付"),
	WX_PUB_QR("wx_pub_qr","微信公众账号扫码支付"),
	YEEPAY_WAP("yeepay_wap","易宝手机网页支付"),
	JDPAY_WAP("jdpay_wap","京东手机网页支付"),
	CNP_U("cnp_u","应用内快捷支付（银联）"),
	CNP_F("cnp_f","应用内快捷支付（外卡）"),
	APPLEPAY_UPACP("applepay_upacp","ApplePay"),
	FQLPAY_WAP("fqlpay_wap","分期乐支付"),
	QGBC_WAP("qgbc_wap","量化派支付");
	
	

	String channel;
	String cnName;
	
	PingppPayChannel(String channel, String cnName){
		 this.channel = channel;
		 this.cnName = cnName;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getCnName() {
		return cnName;
	}

	public void setCnName(String cnName) {
		this.cnName = cnName;
	}
	
	

}
