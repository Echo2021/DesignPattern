package com.test.facade.config;

import org.apache.commons.lang3.StringUtils;

public class StarterService {

	private String userStr;
	
	public StarterService(String userStr) {
		
		this.userStr = userStr;
	}
	
	public String[] split(String separatorChar) {
		
		return StringUtils.split(this.userStr,separatorChar);
		
	}
}
