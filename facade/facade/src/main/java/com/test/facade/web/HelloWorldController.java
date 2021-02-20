package com.test.facade.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test.facade.annotation.DoDoor;
import com.test.facade.domain.UserInfo;

@RestController
public class HelloWorldController {
	
	@Value("${server.port}")
	private int port;
	
	@DoDoor(key = "userId", returnJson = "{\"code\":\"1111\",\"info\":\"非白名单可访问用户拦截！\"}")
	@RequestMapping(path="/api/queryUserInfo",method=RequestMethod.GET)
	public UserInfo queryUserInfo(@RequestParam String userId) {
		
		return new UserInfo("虫虫:"+userId,19,"天津市南开区旮旯胡同100号");
	}
	
}
