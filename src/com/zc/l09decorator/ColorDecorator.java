package com.zc.l09decorator;

public class ColorDecorator extends HouseDecoratorBase {

    public ColorDecorator(House house) {
        super(house);
    }

    //添加颜色功能
    private String addColors() {
        return " + 粉刷";
    }

    @Override
    public String makeHouse() {
        return house.makeHouse() + addColors();
    }
}
