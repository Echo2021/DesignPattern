package com.test.singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class StaticClassMod {

	//静态类 直接初始化Map类，不会延迟加载
	public static Map<String,String> cache = new ConcurrentHashMap<String,String>();
}
