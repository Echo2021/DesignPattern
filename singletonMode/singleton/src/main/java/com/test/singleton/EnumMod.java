package com.test.singleton;

/**
 * @describe 枚举单例，存在继承的场景不能用
 * @author User 
 * @date 2021年2月5日 下午5:06:33
 * @version 1.0
 * @param (参数)
 * @return 
 */
public enum EnumMod {

	INSTANCE;
	public void test() {
		
		System.out.println("hi~");
	}
}
