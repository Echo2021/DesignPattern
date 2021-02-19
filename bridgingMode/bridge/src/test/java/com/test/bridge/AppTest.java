package com.test.bridge;


import java.math.BigDecimal;

import org.junit.Test;

import com.test.bridge_mod.channel.Pay;
import com.test.bridge_mod.channel.WxPay;
import com.test.bridge_mod.channel.ZfbPay;
import com.test.bridge_mod.mode.PayFaceMode;
import com.test.bridge_mod.mode.PayFingerprintMode;

import junit.framework.TestCase;


/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{

	@Test
	public void test_pay() {
		
		PayController pay = new PayController();
		
		System.out.println("\r\n模拟测试场景:微信支付、人脸支付");
		
		pay.doPay("weixin_100329","10001694",new BigDecimal(100), 1, 2);
		
		System.out.println("\r\n 模拟测试场景:支付宝支付、指纹支付");
		
		pay.doPay("zfb_1012131","10023425",new BigDecimal(100),2, 3);
		
		Pay wxPay = new WxPay(new PayFaceMode());
		
		wxPay.transfer("wx_100329","10001988",new BigDecimal(100));
		
		System.out.println("\r\n 模拟场景 支付宝支付");
		
		Pay zfbPay = new ZfbPay(new PayFingerprintMode());
		
		zfbPay.transfer("zfb10003249", "100002342",new BigDecimal(299));
		
		
	}
}
