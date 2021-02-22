package com.test.share_mod;

import com.test.share.Activity;
import com.test.share.Stock;

public class ActivityController2 {

	private RedisUtils redisUtils = new RedisUtils();
	
	public Activity queryActivityInfo(Long id) {
		
		Activity activity = ActivityFactory.getActivity(id);
		
		//模拟redis 获取库存变化
		Stock stock = new Stock(1000,redisUtils.getStockUsed());
		
		activity.setStock(stock);
		
		return activity;
		
	}
}
