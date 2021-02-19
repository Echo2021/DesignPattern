package com.test.singleton;

/**
 * @describe 双重锁校验 线程安全
 * @author User 
 * @date 2021年2月5日 下午4:42:40
 * @version 1.0
 * @param (参数)
 * @return 
 */
public class DoubleCheck {

	private static DoubleCheck instance;
	
	private DoubleCheck() {}
	
	public static DoubleCheck getInstance() {
		
		if(null!=instance) return instance;
		
		synchronized(DoubleCheck.class) {
			
			if(null==instance) {
				
				instance = new DoubleCheck();
				
			}
		}
		
		return instance;
	}
}
