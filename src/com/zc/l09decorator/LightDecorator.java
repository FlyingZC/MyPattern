package com.zc.l09decorator;

public class LightDecorator extends HouseDecoratorBase {

    public LightDecorator(House house) {
        super(house);
    }

    private String addLight() {
        return " + 装饰灯";
    }

    @Override
    public String makeHouse() {
        return house.makeHouse() + addLight();
    }
}
