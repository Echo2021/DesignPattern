package com.test.decoration;

import org.junit.Test;

import com.test.decoration.de_mod.LoginSSODecorator;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
	
	@Test
	public void test_sso() {
		
		SsoInterceptor ssoInterceptor = new SsoInterceptor();
		
		String request = "isuccesshuajua";
		
		boolean success = ssoInterceptor.preHandle(request,"ewadasf","t");
		
		System.out.println("登陆校验："+request+(success?"放行":"拦截"));
		
	}
	
	@Test
	public void test_LoginSsoDecorator() {
		
		LoginSsoDecorator ssoDecorator = new LoginSsoDecorator();
		
		String request = "isuccesshuajua";
		
		boolean success = ssoDecorator.preHandle(request, "eqsiohgjjao","t");
		
		System.out.println("登陆校验:"+request+(success?"放行":"拦截"));
		
	}
	
	@Test
	public void test_LoginSSODecorator() {
		
		LoginSSODecorator ssoDecorator = new LoginSSODecorator(new SsoInterceptor());
		
		String request = "isuccesshuajua";
		
		boolean success = ssoDecorator.preHandle(request, "eqsiohgjjao","t");
		
		System.out.println("登陆校验:"+request+(success?"放行":"拦截"));
		
	}
	
	
    
}
