package com.zc.z05singleton;

import java.lang.reflect.Constructor;

public class T01Singleton {
	public static void main(String[] args) throws Exception {
		SingleEnum en1=SingleEnum.INSTANCE;
		SingleEnum en2=SingleEnum.INSTANCE;
		System.out.println(en1==en2);
		Class<Singleton> clazz=Singleton.class;
		//Constructor<Singleton> con=clazz.getConstructor();
		/*Constructor<?>[] cons=clazz.getConstructors();
		for(Constructor c:cons){
			c.setAccessible(true);
		}*/
		Singleton s1=clazz.newInstance();
		Singleton s2=clazz.newInstance();
		System.out.println(s1==s2);
	}
}
