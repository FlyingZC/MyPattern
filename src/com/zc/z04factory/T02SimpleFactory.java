package com.zc.z04factory;

public class T02SimpleFactory {
    public static void main(String[] args) {
        FoodStore store = new FoodStore(new SimpleFactory());
        store.sellFood(Orange.class);
    }
}
