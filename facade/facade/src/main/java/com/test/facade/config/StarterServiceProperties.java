package com.test.facade.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("facade.door")
public class StarterServiceProperties {

	private String userStr;

	public String getUserStr() {
		return userStr;
	}

	public void setUserStr(String userStr) {
		this.userStr = userStr;
	}

}
