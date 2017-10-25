package com.zc.z04factory;
//静态工厂,类+静态方法
public class StaticFactory {
	public static Student getInstance(){
		return new Student();
	}
	//根据传入的泛型创建不同对象
	public static Food createFood(Class clazz){
		try {
			return (Food) clazz.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}
}
