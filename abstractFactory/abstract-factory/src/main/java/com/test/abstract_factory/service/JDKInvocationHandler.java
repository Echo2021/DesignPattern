package com.test.abstract_factory.service;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import com.test.abstract_factory.util.ClassLoaderUtils;

public class JDKInvocationHandler implements InvocationHandler {
	
	private ICacheAdapter cacheAdapter;
	
	public JDKInvocationHandler(ICacheAdapter cacheAdapter) {
		
		this.cacheAdapter = cacheAdapter;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
	
		return ICacheAdapter.class.getMethod(method.getName(),ClassLoaderUtils.getClazzByArgs(args)).invoke(cacheAdapter, args);
	}

}
