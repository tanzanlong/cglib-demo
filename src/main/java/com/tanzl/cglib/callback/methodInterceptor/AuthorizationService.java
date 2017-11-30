package com.tanzl.cglib.callback.methodInterceptor;

import java.lang.reflect.Method;

public interface AuthorizationService {
	void authorize(Method method);

}
