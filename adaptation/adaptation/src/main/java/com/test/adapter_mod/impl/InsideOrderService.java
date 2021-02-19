package com.test.adapter_mod.impl;

import com.test.adapter_mod.OrderAdapterService;
import com.test.common_mod.service.OrderService;

public class InsideOrderService implements OrderAdapterService {
	
	private OrderService orderService = new OrderService();

	@Override
	public boolean isFirst(String uId) {
		
		return orderService.queryUserOrderCount(uId)<=1;
	}

}
