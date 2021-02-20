package com.test.decoration.de_mod;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.test.decoration.HandlerInterceptor;

public class LoginSSODecorator extends SsoDecorator {

	private Logger logger = LoggerFactory.getLogger(LoginSSODecorator.class);
	
	private static Map<String,String> authMap = new ConcurrentHashMap<String,String>();
	
	static {
		
		authMap.put("huahua","queryUserInfo");
		
		authMap.put("doudou","queryUserInfo");
		
	}
	
	public LoginSSODecorator(HandlerInterceptor handlerInterceptor) {
		
		super(handlerInterceptor);
		
	}
	
	@Override
	public boolean preHandle(String request,String response,Object handler) {
		
		boolean success = super.preHandle(request, response, handler);
		
		if(!success) return false;
		
		String userId = request.substring(8);
		
		String method = authMap.get(userId);
		
		logger.info("模拟单点登陆方法拦截校验:{} {}",userId,method);
		
		// 模拟方法校验
        return "queryUserInfo".equals(method);
	}
}
