package com.zc.z04factory;

//简单工厂
public class SimpleFactory {
    //没有static
    public Food createFood(Class clazz) {
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
