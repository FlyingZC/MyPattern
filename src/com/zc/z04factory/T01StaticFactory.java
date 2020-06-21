package com.zc.z04factory;

public class T01StaticFactory {
    public static void main(String[] args) {
        StaticFactory.createFood(Orange.class);
        StaticFactory.createFood(Apple.class);
        StaticFactory.getInstance();
    }
}
