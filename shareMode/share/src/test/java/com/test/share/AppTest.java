package com.test.share;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSON;
import com.test.share_mod.ActivityController2;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
   private Logger logger = LoggerFactory.getLogger(AppTest.class);
   
   private ActivityController activityController = new ActivityController();
   
   private ActivityController2 activityController2 = new ActivityController2();
   
   
   @Test
   public void test_queryActivityInfo() {
	   
	   Long req = 10001L;
       Activity activity = activityController.queryActivityInfo(req);
       logger.info("测试结果：{} {}", req, JSON.toJSONString(activity));
	   
   }
   
   @Test
   public void test_queryActivityInfo2() throws InterruptedException {
	   
	   for(int idx=0;idx<10;idx++) {
		   
		   Long req = 10001L;
           Activity activity = activityController2.queryActivityInfo(req);
           logger.info("测试结果：{} {}", req, JSON.toJSONString(activity));
           Thread.sleep(1200); 
		   
	   }
	   
   }
   
}
