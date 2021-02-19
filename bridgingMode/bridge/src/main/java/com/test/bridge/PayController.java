package com.test.bridge;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PayController {

	private Logger logger = LoggerFactory.getLogger(PayController.class);
	
	public boolean doPay(String uId,String tradeId,BigDecimal amount,int channelType,int modeType) {
		
		if(1==channelType) {
			
			logger.info("模拟微信渠道支付转账开始,uId: {} tradeId: {} amount: {}",uId,tradeId,amount);
			if (1 == modeType) {
                logger.info("密码支付，风控校验环境安全");
            } else if (2 == modeType) {
                logger.info("人脸支付，风控校验脸部识别");
            } else if (3 == modeType) {
                logger.info("指纹支付，风控校验指纹信息");
            }

		}else if(2==channelType) {
			
			logger.info("模拟支付宝渠道支付划账开始。uId：{} tradeId：{} amount：{}", uId, tradeId, amount);
            if (1 == modeType) {
                logger.info("密码支付，风控校验环境安全");
            } else if (2 == modeType) {
                logger.info("人脸支付，风控校验脸部识别");
            } else if (3 == modeType) {
                logger.info("指纹支付，风控校验指纹信息");
            }
			
			
		}
		
		
		return true;
	}
}
