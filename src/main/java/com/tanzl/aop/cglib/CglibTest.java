package com.tanzl.aop.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.NoOp;

public class CglibTest {
	
	public  String getName(){
		return "tanzl";
	}
	
	
	
	public Object createProxy(Class targetClass) {
	     Enhancer enhancer = new Enhancer();
	     enhancer.setSuperclass(targetClass);
	     enhancer.setCallback(NoOp.INSTANCE);
	     return enhancer.create();
	}
	
	public static void main(String[] args) {
		CglibTest cglibTest=new CglibTest();
		CglibTest cglibTestproxy=(CglibTest) cglibTest.createProxy(CglibTest.class);
		System.out.println(cglibTestproxy.getName());
		
	}
}
