package com.test.abstract_factory;

import org.junit.Test;

import com.test.abstract_factory.service.JDKProxy;
import com.test.abstract_factory.service.impl.EGMCacheAdapter;
import com.test.abstract_factory.service.impl.IIRCacheAdapter;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{

    
    
   /* @Test
    public void test_CacheService() {
    	
    	CacheService cacheService = new CacheServiceImpl();
    	
    	cacheService.set("user_name_01","张三",1);
    	
    	String value01 = cacheService.get("user_name_01", 1);
    	
    	System.out.println(value01);
    	
    	
    }*/
    
    @Test
    public void test_AbsCacheService() throws Exception {
    	
    	CacheService proxy_EGM = JDKProxy.getProxy(CacheServiceImpl.class,new EGMCacheAdapter());
    	
    	proxy_EGM.set("user_name_01","张三");
    	
    	String value01 = proxy_EGM.get("user_name_01");
    	
    	System.out.println("测试结果:"+value01);
    	
    	CacheService proxy_IIR = JDKProxy.getProxy(CacheServiceImpl.class,new IIRCacheAdapter());
    	
    	proxy_IIR.set("user_name_02","李四");
    	
    	String value02 = proxy_IIR.get("user_name_02");
    	
    	System.out.println("测试结果:"+value02);
    }
}
