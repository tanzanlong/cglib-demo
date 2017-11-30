package com.tanzl.cglib.callback.methodInterceptor;

public interface PersistenceService {
	public void save(long id, String data);
	
	public String load(long id) ;
}
