package com.tanzl.cglib.simple.exaple;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.NoOp;

public class SimpleCglibExample {
	/**
	 * 使用默认构造器创建对象 使用带参数构造器创建对象需要使用
	 * @return a new proxy for a target class instance
	 */
	
	public Object createProxyByDefaultConstruct(Class targetClass) {
	
	     Enhancer enhancer = new Enhancer();
	
	     enhancer.setSuperclass(targetClass);
	
	     enhancer.setCallback(NoOp.INSTANCE);
	
	     return enhancer.create();
	
	}
	
	
	/**使用参数构造器创建对象 使用带参数构造器创建对象需要使用 参数中原始类型需要使用包装类
	 * @param targetClass
	 * @param argumentTypes 参数类型
	 * @param arguments     参数值
	 * @return
	 */
	public Object createProxyByParamConstruct(Class targetClass,Class[] argumentTypes, Object[]arguments) {
		
	     Enhancer enhancer = new Enhancer();
	
	     enhancer.setSuperclass(targetClass);
	
	     enhancer.setCallback(NoOp.INSTANCE);
	
	     return enhancer.create(argumentTypes, arguments);
	
	}

}
