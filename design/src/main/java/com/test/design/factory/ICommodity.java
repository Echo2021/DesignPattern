package com.test.design.factory;

import java.util.Map;

public interface ICommodity {

	void sendCommondity(String uId,String commodityId,String bizId,Map<String,String> extMap) throws Exception;
}
