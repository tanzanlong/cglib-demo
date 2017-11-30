package com.tanzl.cglib.callback.methodInterceptor;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class AuthorizationInterceptor implements MethodInterceptor{
	
	AuthorizationService authorizationService;
	
	public AuthorizationInterceptor(AuthorizationService authorizationService) {
		this.authorizationService=authorizationService;
	}

	@Override
	public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        if(authorizationService!=null) {
        	authorizationService.authorize(method);
        }
		return methodProxy.invokeSuper(object, args);
	}

}
