package com.test.prototype;


import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.test.prototype.protoMod.QuestionBankController;

import junit.framework.TestCase;


public class AppTest 
    extends TestCase
{
   
	@Test
	public void test_PrototypeMod() throws CloneNotSupportedException {
		
		QuestionBankController questionBankController = new QuestionBankController();
		
		System.out.println(questionBankController.createPaper("花花","1000001921032"));
		
		System.out.println(questionBankController.createPaper("豆豆","1000001921033"));
		
		System.out.println(questionBankController.createPaper("大宝","1000001921034"));
		
	}
	
	@Test
	public void test_test() {
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		
		list.add(2);
		
		list.add(3);
		
		Integer a = list.set(2,list.get(1));
		
		//Integer b = list.set(1, list.set(2, list.get(1)));
		
		System.out.println("aaaa:"+a);
		
		for(int i=0;i<list.size();i++) {
			
			System.out.println("listttt aa:"+list.get(i));
		}
		
	}
	
}
