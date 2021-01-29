package com.test.build;

import java.math.BigDecimal;

import org.junit.Test;

import com.test.build.buildMode.Builder;
import com.test.build.commoMode.DecorationPackageController;

import junit.framework.TestCase;

public class AppTest 
    extends TestCase
{
    
	@Test
	public void test_DecorationPackageController() {
		
		DecorationPackageController decoration = new DecorationPackageController();
		
		System.out.println(decoration.getMatterList(new BigDecimal("123.23"),1));
		
		System.out.println(decoration.getMatterList(new BigDecimal("87.23"),2));
		
		System.out.println(decoration.getMatterList(new BigDecimal("80.2"),3));
		
		
	}
	
	@Test
	public void test_DecorationPackageController2() {
		
		Builder builder = new Builder();
		
		System.out.println(builder.levelOne(123.52D).getDetail());
		
		System.out.println(builder.levelOne(100.52D).getDetail());
		
		System.out.println(builder.levelOne(99.52D).getDetail());
		
	}
}
