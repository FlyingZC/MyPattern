package com.zc.z04factory;

public class Apple extends Fruit {
    public Apple() {
        System.out.println("这是一个苹果构造器" );
    }

    @Override
    public String toString() {
        return "apple";
    }
}
