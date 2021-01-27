package com.test.design.factory.service;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSON;
import com.test.design.factory.ICommodity;
import com.test.goods.goods.DeliverReq;
import com.test.goods.goods.GoodsService;

public class GoodsCommodityService implements ICommodity {
	
	private Logger logger = LoggerFactory.getLogger(GoodsCommodityService.class);
	
	private GoodsService goodsService = new GoodsService();

	@Override
	public void sendCommondity(String uId, String commodityId, String bizId, Map<String, String> extMap)
			throws Exception {
		
		DeliverReq deliverReq = new DeliverReq();
		
		deliverReq.setUserName(queryUserName(uId));
		
		deliverReq.setUserPhone(queryUserPhoneNumber(uId));
		
		deliverReq.setSku(commodityId);
		
		deliverReq.setOrderId(bizId);
		
		deliverReq.setConUserName(extMap.get("conUserName"));
		
		deliverReq.setConUserPhone(extMap.get("conUserPhone"));
		
		deliverReq.setConUserAddress(extMap.get("conUserAddress"));
		
		boolean isSuccess = goodsService.deliverGoods(deliverReq);
		
		logger.info("请求参数(实物)=》 uid:{} commodityId:{} bizId:{} extMap:{}",uId,commodityId,bizId,JSON.toJSON(extMap));
		
		logger.info("测试结果[实物]:{}",isSuccess);
		
		if(!isSuccess) throw new RuntimeException("实物商品发放失败");
	

	}
	
	private String queryUserName(String uId) {
		
		return "小明";
	}
	
	private String queryUserPhoneNumber(String uId) {
		
		return "1200000300";
	}

}
