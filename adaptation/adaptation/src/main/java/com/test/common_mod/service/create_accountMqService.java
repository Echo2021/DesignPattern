package com.test.common_mod.service;

import com.alibaba.fastjson.JSON;
import com.test.common_mod.mq.create_account;

public class create_accountMqService {

	public void onMessage(String message) {
		
		 create_account mq = JSON.parseObject(message, create_account.class);

	        mq.getNumber();
	        mq.getAccountDate(); 
		
	}
}
