package com.zc.l01factory;
//具体产品类
public class Dog implements Pet{

	@Override
	public String petSound() {
		return "Dog Bow Bow...";
	}

}
