package com.zc.l04singleton;

import java.lang.reflect.Constructor;

public class Test {
    public static void main(String[] args) throws Exception {
        //第一次实例化
        SingletonA instanceA = SingletonA.getInstance();
        //访问的是已存在的实例,不调用构造器
        SingletonA instanceA2 = SingletonA.getInstance();

        Class<SingletonA> clazz = SingletonA.class;
        //获取无参构造方法.反射暴力访问单例模式
        Constructor<SingletonA> construct = clazz.getDeclaredConstructor(null);
        construct.setAccessible(true);
        //第二次实例化抛异常
        SingletonA instance = construct.newInstance();
    }
}
