package com.test.abstract_factory.service.impl;

import java.util.concurrent.TimeUnit;

import com.test.abstract_factory.service.ICacheAdapter;
import com.test.cluster.node.EGM;


public class EGMCacheAdapter implements ICacheAdapter {
	
	private EGM egm = new EGM();

	@Override
	public String get(String key) {
		
		return egm.gain(key);
	}

	@Override
	public void set(String key, String value) {
		egm.set(key, value);
	}

	@Override
	public void set(String key, String value, long timeout, TimeUnit timeUnit) {
		egm.setEx(key, value, timeout, timeUnit);
	}

	@Override
	public void del(String key) {
		egm.delete(key);
	}

}
