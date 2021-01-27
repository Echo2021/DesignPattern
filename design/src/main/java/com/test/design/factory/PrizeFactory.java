package com.test.design.factory;

import com.test.design.factory.service.CardCommodityService;
import com.test.design.factory.service.CouponCommodityService;
import com.test.design.factory.service.GoodsCommodityService;

public class PrizeFactory {

	public ICommodity getCommodityService(Integer commodityType) {
		
		if(null==commodityType) return null;
		
		if(1==commodityType) return new CouponCommodityService();
		
		if(2==commodityType) return new GoodsCommodityService();
		
		if(3==commodityType) return new CardCommodityService();
		
		throw new RuntimeException("不存在商品服务类型");
	}
}
