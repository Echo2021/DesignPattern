package com.test.cluster;

import java.util.concurrent.TimeUnit;

import com.test.cluster.node.EGM;
import com.test.cluster.node.IIR;

public class CacheServiceImpl implements CacheService {
	
	private RedisUtils redisUtils = new RedisUtils();
	
	private EGM egm = new EGM();
	
	private IIR iir = new IIR();

	@Override
	public String get(String key, int redisType) {
		
		if(1==redisType) {
			
			return egm.gain(key);
		}else if (2==redisType){
			
			return iir.get(key);
		}
		
		 return redisUtils.get(key);
	}

	@Override
	public void set(String key, String value, int redisType) {
		
		if(1==redisType) {
			egm.set(key, value);
			return;
		}
		
		if(2==redisType) {
			
			iir.set(key, value);
			
			return;
			
		}
		
		redisUtils.set(key, value);
	}

	@Override
	public void set(String key, String value, long timeout, TimeUnit timeUnit) {
		 redisUtils.set(key, value, timeout, timeUnit);

	}

	@Override
	public void del(String key) {
		 redisUtils.del(key);
	}

}
