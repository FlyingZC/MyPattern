package com.zc.z05singleton;
//懒汉式,需要时候再创建
public class Singleton {
	private Singleton(){
		System.out.println("私有化构造器");
	}
	private static Singleton instance;
	public static Singleton getInstance(){
		if(instance==null){//如果第一次没有创建实例,注意仍可能有多个线程进入到这里,尽管后面synchronized里只能
			synchronized(Singleton.class){
				if(instance==null){
					instance=new Singleton();
				}
			}
		}
		return instance;
	}
	
}
