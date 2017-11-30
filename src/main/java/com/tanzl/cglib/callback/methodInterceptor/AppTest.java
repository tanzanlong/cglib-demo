package com.tanzl.cglib.callback.methodInterceptor;

import org.springframework.cglib.proxy.Callback;
import org.springframework.cglib.proxy.CallbackFilter;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.NoOp;

/**http://ifeve.com/cglib-desc/
 * @author baibei
 *
 */
public class AppTest {
public static void main(String[] args) {
	Enhancer enhancer = new Enhancer();
	enhancer.setSuperclass(PersistenceServiceImpl.class);
	CallbackFilter callbackFilter = new PersistenceServiceCallbackFilter();
	enhancer.setCallbackFilter(callbackFilter);
	Callback saveCallback = new AuthorizationInterceptor(authorizationService);
	Callback loadCallback = NoOp.INSTANCE;
	Callback[] callbacks = new Callback[]{saveCallback, loadCallback };
	enhancer.setCallbacks(callbacks);
	PersistenceServiceImpl p= (PersistenceServiceImpl)enhancer.create();

}
}
