package com.chia.vo;

import com.chia.annontation.ChiaCharge;

public class ChiaChargeVO {
	@ChiaCharge(name = "order_no")
	String orderNo;
	@ChiaCharge(name = "app", isMap = true, mapName = "app")
	String appId;
	@ChiaCharge(name = "channel")
	String channel;
	@ChiaCharge(name = "amount")
	Integer amount;
	@ChiaCharge(name = "client_ip")
	String clientIp;
	@ChiaCharge(name = "currency")
	String currency = "cny";
	@ChiaCharge(name = "subject")
	String subject;
	@ChiaCharge(name = "body")
	String body;
	@ChiaCharge(name = "extern_token", isMap = true, mapName = "extra")
	String externToken;
	@ChiaCharge(name = "alipay_open_id", isMap = true, mapName = "extra")
	String alipayOpenId;
	@ChiaCharge(name = "rn_check", isMap = true, mapName = "extra")
	String rnCheck;
	@ChiaCharge(name = "success_url", isMap = true, mapName = "extra")
	String successUrl;
	@ChiaCharge(name = "cancel_url", isMap = true, mapName = "extra")
	String cancel_url;
	@ChiaCharge(name = "limit_pay", isMap = true, mapName = "extra")
	String limitPay;
	@ChiaCharge(name = "enable_anti_phishing_key", isMap = true, mapName = "extra")
	String enableAntiPhishingKey;
	@ChiaCharge(name = "open_id", isMap = true, mapName = "extra")
	String openId;
	@ChiaCharge(name = "goods_tag", isMap = true, mapName = "extra")
	String goodsTag;
	@ChiaCharge(name = "time_expire")
	Long timeExpire;
	@ChiaCharge(name = "description")
	String description;
	
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public String getClientIp() {
		return clientIp;
	}
	public void setClientIp(String clientIp) {
		this.clientIp = clientIp;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getExternToken() {
		return externToken;
	}
	public void setExternToken(String externToken) {
		this.externToken = externToken;
	}
	public String getAlipayOpenId() {
		return alipayOpenId;
	}
	public void setAlipayOpenId(String alipayOpenId) {
		this.alipayOpenId = alipayOpenId;
	}
	public String getRnCheck() {
		return rnCheck;
	}
	public void setRnCheck(String rnCheck) {
		this.rnCheck = rnCheck;
	}
	public String getSuccessUrl() {
		return successUrl;
	}
	public void setSuccessUrl(String successUrl) {
		this.successUrl = successUrl;
	}
	public String getCancel_url() {
		return cancel_url;
	}
	public void setCancel_url(String cancel_url) {
		this.cancel_url = cancel_url;
	}
	public String getLimitPay() {
		return limitPay;
	}
	public void setLimitPay(String limitPay) {
		this.limitPay = limitPay;
	}
	public String getEnableAntiPhishingKey() {
		return enableAntiPhishingKey;
	}
	public void setEnableAntiPhishingKey(String enableAntiPhishingKey) {
		this.enableAntiPhishingKey = enableAntiPhishingKey;
	}
	public String getOpenId() {
		return openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getGoodsTag() {
		return goodsTag;
	}
	public void setGoodsTag(String goodsTag) {
		this.goodsTag = goodsTag;
	}
	public Long getTimeExpire() {
		return timeExpire;
	}
	public void setTimeExpire(Long timeExpire) {
		this.timeExpire = timeExpire;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
