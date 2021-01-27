package com.test.abstract_factory;

import org.junit.Test;

import com.test.cluster.CacheService;
import com.test.cluster.CacheServiceImpl;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{

    
    
    @Test
    public void test_CacheService() {
    	
    	CacheService cacheService = new CacheServiceImpl();
    	
    	cacheService.set("user_name_01","张三",1);
    	
    	String value01 = cacheService.get("user_name_01", 1);
    	
    	System.out.println(value01);
    	
    	
    }
}
