package com.zc.l00simplefactory;
//工厂方法模式实现
public class PetFactory implements Factory{
	@Override
	public Pet getInstance(Class<?> clazz){
		try {
			return (Pet) clazz.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static Pet getCatInstance()
	{
	    return new Cat();
	}
}
