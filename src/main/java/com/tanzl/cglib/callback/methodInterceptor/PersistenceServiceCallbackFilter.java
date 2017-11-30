package com.tanzl.cglib.callback.methodInterceptor;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.CallbackFilter;

public class PersistenceServiceCallbackFilter implements CallbackFilter {
	private static final int SAVE = 0;
	private static final int LOAD = 1;

	@Override
	public int accept(Method method) {
		String name = method.getName();
		if ("save".equals(name)) {
			return SAVE;
		}
		return LOAD;
	}

}
