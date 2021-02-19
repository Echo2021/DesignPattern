package com.test.singleton;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @describe CAS 线程安全，没有获取到会死循环
 * @author User 
 * @date 2021年2月5日 下午5:00:01
 * @version 1.0
 * @param (参数)
 * @return 
 */
public class CASMod {

	private static final AtomicReference<CASMod> INSTANCE = new AtomicReference<CASMod>();
	
	private static CASMod instance;
	
	private CASMod() {}
	
	public static final CASMod getInstance() {
		
		for(;;) {
			
			CASMod instance = INSTANCE.get();
			
			if(null!=instance) return instance;
			
			INSTANCE.compareAndSet(null,new CASMod());
			
			return INSTANCE.get();
			
		}
	}
	
	
}
