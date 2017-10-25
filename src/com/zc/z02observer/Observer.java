package com.zc.z02observer;
/**
 * 所有观察者必须实现该接口
 * 相当于用户
 * */
public interface Observer {
	public void update(String msg);	
}
