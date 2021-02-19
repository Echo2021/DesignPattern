package com.test.adaptation;

import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.test.adapter_mod.MQAdapter;
import com.test.adapter_mod.OrderAdapterService;
import com.test.adapter_mod.RebateInfo;
import com.test.adapter_mod.impl.InsideOrderService;
import com.test.adapter_mod.impl.POPOrderAdapterServiceImpl;
import com.test.common_mod.mq.OrderMq;
import com.test.common_mod.mq.create_account;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
   
	@Test
	public void test_MQAdapter() throws NoSuchMethodException,IllegalAccessException,InvocationTargetException,ParseException{
		
		SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		Date parse = s.parse("2020-06-01 00:00:00");
		
		create_account create_account = new create_account();
		
		create_account.setNumber("100001");
		
		create_account.setAddress("河北省.廊坊市.广阳区.大学里职业技术学院");
        create_account.setAccountDate(parse);
        create_account.setDesc("在校开户");
        
        HashMap<String, String> link01 = new HashMap<String, String>();
        link01.put("userId", "number");
        link01.put("bizId", "number");
        link01.put("bizTime", "accountDate");
        link01.put("desc", "desc");
        
        RebateInfo rebateInfo1 = MQAdapter.filter(create_account.toString(),link01);
        
        System.out.println("mq.create_account(适配前)"+create_account.toString());

        System.out.println("mq.create_account(适配后)"+JSON.toJSONString(rebateInfo1));
        
        System.out.println("");
        
        OrderMq orderMq = new OrderMq();
        orderMq.setUid("100001");
        orderMq.setSku("10928092093111123");
        orderMq.setOrderId("100000890193847111");
        orderMq.setCreateOrderTime(parse);
        
        HashMap<String, String> link02 = new HashMap<String, String>();
        link02.put("userId", "uid");
        link02.put("bizId", "orderId");
        link02.put("bizTime", "createOrderTime");
        RebateInfo rebateInfo02 = MQAdapter.filter(orderMq.toString(), link02);
        System.out.println("mq.orderMq(适配前)" + orderMq.toString());
        System.out.println("mq.orderMq(适配后)" + JSON.toJSONString(rebateInfo02));
        
        Map<String,Object> testMap = new HashMap<String,Object>();
        
        testMap.put("uid",10001);
        
        testMap.put("orderId",100025);
        
        testMap.put("orderTime","2021-02-19");
        
        HashMap<String,String> link03 = new HashMap<String,String>();
        
        link03.put("userId","uid");
        
        link03.put("bizId","orderId");
        
        link03.put("bizTime","orderTime");
        
        RebateInfo rebateInfo03 = MQAdapter.filter(testMap, link03);
        
        System.out.println("hash map 适配前:"+testMap.toString());

        System.out.println("hash map 适配后:"+rebateInfo03.toString());
        
	
	}
	
	@Test
	public void test_isFirstAdapter() {
		
		OrderAdapterService popOrderAdapterService = new POPOrderAdapterServiceImpl();
		
		System.out.println("判断首单,接口适配(POP):"+popOrderAdapterService.isFirst("100001"));
		
		OrderAdapterService insideOrderService = new InsideOrderService();
		
		System.out.println("判断首单，接口适配(自营):"+insideOrderService.isFirst("100001"));
		
	}
}
