package com.test.bridge_mod.channel;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.test.bridge_mod.mode.IPayMode;

public abstract class Pay {

	private Logger logger = LoggerFactory.getLogger(Pay.class);
	
	protected IPayMode payMode;
	
	public Pay(IPayMode payMode) {
		
		this.payMode = payMode;
	}
	
	public abstract String transfer(String uId,String tradeId,BigDecimal amoung);
}
