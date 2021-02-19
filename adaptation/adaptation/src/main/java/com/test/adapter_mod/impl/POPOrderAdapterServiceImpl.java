package com.test.adapter_mod.impl;

import com.test.adapter_mod.OrderAdapterService;
import com.test.common_mod.service.POPOrderService;

public class POPOrderAdapterServiceImpl implements OrderAdapterService {
	
	private POPOrderService popOrderService = new POPOrderService();

	@Override
	public boolean isFirst(String uId) {
		
		return popOrderService.isFirstOrder(uId);
	}

}
