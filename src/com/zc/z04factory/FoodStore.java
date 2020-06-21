package com.zc.z04factory;

//水果店
public class FoodStore {
    //将工厂类组合进来
    private SimpleFactory factory;

    public FoodStore(SimpleFactory factory) {
        this.factory = factory;
    }

    /*
     * 根据传入类型不同卖不同水果
     * */
    public Food sellFood(Class clazz) {
        Food food = factory.createFood(clazz);
        food.prepare();
        food.pack();
        food.fire();
        return food;
    }
}
