package com.test.decoration;

public interface HandlerInterceptor {

	boolean preHandle(String request,String response,Object handler);
}
