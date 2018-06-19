package com.zc.l00simplefactory;

public interface Factory {
	//public <T> T getInstance(Class<? extends T> clazz);
	public Object getInstance(Class<?> clazz);
}
