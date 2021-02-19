package com.test.singleton;

/**
 * @describe 饿汉模式(线程安全),程序启动直接加载，
 * @author User 
 * @date 2021年2月5日 下午4:15:51
 * @version 1.0
 * @param (参数)
 * @return 
 */
public class HungryMod {

	private static HungryMod instance = new HungryMod();
	
	private HungryMod() {}
	
	public static HungryMod getInstance() {
		
		return instance;
	}
}
