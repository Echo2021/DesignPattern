package com.test.design.factory.service;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSON;
import com.test.design.factory.ICommodity;
import com.test.goods.coupon.CouponResult;
import com.test.goods.coupon.CouponService;

public class CouponCommodityService implements ICommodity {

	private Logger logger = LoggerFactory.getLogger(CouponCommodityService.class);
	
	private CouponService couponService = new CouponService();
	
	@Override
	public void sendCommondity(String uId, String commodityId, String bizId, Map<String, String> extMap)
			throws Exception {
	
		CouponResult couponResult = couponService.sendCoupon(uId, commodityId, bizId);
		
		logger.info("请求参数(优惠券)=》 uid:{} commodityId:{} bizId:{} extMap:{}",uId,commodityId,bizId,JSON.toJSON(extMap));
		
		logger.info("测试结果[优惠券]:{}",JSON.toJSON(couponResult));
		
		if(!"0000".equals(couponResult.getCode())) throw new RuntimeException(couponResult.getInfo());
	

	}

}
