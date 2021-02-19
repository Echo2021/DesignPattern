package com.test.common_mod.service;

import com.alibaba.fastjson.JSON;
import com.test.common_mod.mq.OrderMq;

public class OrderMqService {

	public void onMessage(String message) {
		
		OrderMq mq = JSON.parseObject(message,OrderMq.class);
		
		mq.getUid();
		
		mq.getOrderId();
		
		mq.getCreateOrderTime();
		
	}
}
