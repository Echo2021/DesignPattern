package com.test.design.factory.service;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSON;
import com.test.design.factory.ICommodity;
import com.test.goods.card.CardService;

public class CardCommodityService implements ICommodity {

	private Logger logger = LoggerFactory.getLogger(CouponCommodityService.class);
	
	private CardService cardService = new CardService();
	
	@Override
	public void sendCommondity(String uId, String commodityId, String bizId, Map<String, String> extMap)
			throws Exception {
		
		String mobile = queryUserMobile(uId);
		
		cardService.getToken(mobile, uId);
		
		logger.info("请求参数(会员卡)=》 uid:{} commodityId:{} bizId:{} extMap:{}",uId,commodityId,bizId,JSON.toJSON(extMap));
		
		logger.info("测试结果[会员卡]:{}");

	}
	
	private String queryUserMobile(String uId) {
		
		return "1522016661";
	}

}
