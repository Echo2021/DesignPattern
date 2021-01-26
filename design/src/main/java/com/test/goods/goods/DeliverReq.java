package com.test.goods.goods;

public class DeliverReq {

	private String userName;
	
	private String userPhone;
	
	private String sku;
	
	private String orderId;
	
	private String conUserName;
	
	private String conUserPhone;
	
	private String conUserAddress;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getConUserName() {
		return conUserName;
	}

	public void setConUserName(String conUserName) {
		this.conUserName = conUserName;
	}

	public String getConUserPhone() {
		return conUserPhone;
	}

	public void setConUserPhone(String conUserPhone) {
		this.conUserPhone = conUserPhone;
	}

	public String getConUserAddress() {
		return conUserAddress;
	}

	public void setConUserAddress(String conUserAddress) {
		this.conUserAddress = conUserAddress;
	}
	
}
