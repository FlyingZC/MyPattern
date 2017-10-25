package com.zc.l09decorator;
//用于增加装饰器的基类
public class SimpleHouse implements House{
	@Override
	public String makeHouse() {
		return "Base House";
	}

}
