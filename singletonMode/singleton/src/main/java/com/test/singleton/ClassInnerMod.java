package com.test.singleton;

/**
 * @describe 类的内部类,线程安全且懒加载(推荐)
 * @author User 
 * @date 2021年2月5日 下午4:22:01
 * @version 1.0
 * @param (参数)
 * @return 
 */
public class ClassInnerMod {

	private static class ClassInnerHolder{
		
		private static ClassInnerMod instance = new ClassInnerMod();
	}
	
	private ClassInnerMod() {
		
	}
	
	public static ClassInnerMod getInstance() {
		
		
		return ClassInnerHolder.instance;
		
	}
}
