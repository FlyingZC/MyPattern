package com.zc.l01factory;

public interface Factory {
	//public <T> T getInstance(Class<? extends T> clazz);
	public Object getInstance(Class<?> clazz);
}
