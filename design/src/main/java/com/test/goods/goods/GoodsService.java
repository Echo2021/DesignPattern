package com.test.goods.goods;

import com.alibaba.fastjson.JSON;

public class GoodsService {
	
	public boolean deliverGoods(DeliverReq req) {
		
		System.out.println("模拟发货实物商品："+JSON.toJSONString(req));
		
		return true;
		
	}
}
