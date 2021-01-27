package com.test.abstract_factory.service.impl;

import java.util.concurrent.TimeUnit;

import com.test.abstract_factory.service.ICacheAdapter;
import com.test.cluster.node.IIR;

public class IIRCacheAdapter implements ICacheAdapter {
	
	private IIR iir = new IIR();
	
	@Override
	public String get(String key) {
		
		
		return iir.get(key);
	}

	@Override
	public void set(String key, String value) {
		iir.set(key, value);
	}

	@Override
	public void set(String key, String value, long timeout, TimeUnit timeUnit) {
		iir.setExpire(key, value, timeout, timeUnit);
	}

	@Override
	public void del(String key) {
		iir.del(key);
	}

}
