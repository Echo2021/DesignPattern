package com.test.singleton;



/**
 * @describe 懶漢模式(綫程不安全),单例模式不允许外部直接创建，
 * @author User 
 * @date 2021年2月5日 下午3:50:37
 * @version 1.0
 * @param (参数)
 * @return 
 */
public class LazyMod {

	private static LazyMod instance;
	
	//不允许外部创建
	private LazyMod() {
		
	}
	
	public static LazyMod getInstance() {
		
		if(null!=instance) return instance;
		
		instance = new LazyMod();
		
		return instance;
		
	}
}
