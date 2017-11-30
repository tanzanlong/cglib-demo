package com.tanzl.cglib.callback.methodInterceptor;

public class PersistenceServiceImpl implements PersistenceService {

	@Override
	public void save(long id, String data) {
		 System.out.println(data + " has been saved successfully.");
	}

	@Override
	public String load(long id) {
		// TODO Auto-generated method stub
		return "Jason Zhicheng Li";
	}

}
