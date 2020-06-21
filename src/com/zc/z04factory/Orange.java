package com.zc.z04factory;

public class Orange extends Fruit {
    public Orange() {
        System.out.println("这是一个橘子构造器" );
    }

    @Override
    public String toString() {
        return "橘子";
    }
}
