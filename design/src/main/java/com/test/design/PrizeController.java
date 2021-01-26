package com.test.design;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSON;
import com.test.goods.card.CardService;
import com.test.goods.coupon.CouponResult;
import com.test.goods.coupon.CouponService;
import com.test.goods.goods.DeliverReq;
import com.test.goods.goods.GoodsService;

public class PrizeController {

	private Logger logger = LoggerFactory.getLogger(PrizeController.class);
	
	public AwardRes awardToUser(AwardReq req) {
		
		String reqJson = JSON.toJSONString(req);
		
		AwardRes awardRes = null;
		
		try {
			
			logger.info("奖品发放，req:{}",req.getuId(),reqJson);
			
			if(req.getAwardType()==1) {
				
				CouponService couponService = new CouponService();
				
				CouponResult couponResult = couponService.sendCoupon(req.getuId(),req.getAwardNum(),req.getBizId());

				if("0000".equals(couponResult.getCode())) {
					awardRes = new AwardRes("0000","发送成功");
				}else {
					awardRes = new AwardRes("0001",couponResult.getInfo());
				}
				
			}else if(req.getAwardType()==2) {
				
				GoodsService goodsService = new GoodsService();
				
				DeliverReq deliverReq = new DeliverReq();
				
				deliverReq.setUserName(queryUserName(req.getuId()));
				
				deliverReq.setUserPhone(queryUserPhoneNumber(req.getuId()));
				
				deliverReq.setSku(req.getAwardNum());
				
				deliverReq.setOrderId(req.getBizId());
				
				deliverReq.setConUserName(req.getExpMap().get("conUserName"));
				
				deliverReq.setConUserPhone(req.getExpMap().get("conUserPhone"));
				
				deliverReq.setConUserAddress(req.getExpMap().get("conUserAddress"));
				
				boolean isSuccess = goodsService.deliverGoods(deliverReq);
				
				if(isSuccess) {
					awardRes = new AwardRes("0000","发放成功");
				}else {
					awardRes = new AwardRes("0001","发放失败");
				}
				
			}else {
				
				String mobileNum = queryUserPhoneNumber(req.getuId());
				
				CardService cardService = new CardService();
				
				cardService.getToken(mobileNum,req.getAwardNum());
				
				awardRes = new AwardRes("0000","发放成功");
				
			}
			
			logger.info("奖品发放完成{}。",req.getuId());
			
			
		}catch(Exception e) {
			
			logger.error("奖品发放失败{}，req:{}",req.getuId(),reqJson,e);
			
			awardRes = new AwardRes("0001",e.getMessage());
			
		}
		
		
		return awardRes;
	
	}
	
	private String queryUserName(String uId) {
		
		return "小明";
	}
	
	private String queryUserPhoneNumber(String uId) {
		
		return "1200000300";
	}
	
}
