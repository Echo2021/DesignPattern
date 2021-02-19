package com.test.singleton;

/**
 * @describe 懒汉模式(线程安全)，延迟加载
 * @author User 
 * @date 2021年2月5日 下午4:03:56
 * @version 1.0
 * @param (参数)
 * @return 
 */
public class ConLazyMod {

	private static ConLazyMod instance;
	
	private ConLazyMod() {}
	
	public static synchronized ConLazyMod getInstance() {
		
		if(null!=instance) return instance;
		
		instance = new ConLazyMod();
		
		return instance;
	}
}
