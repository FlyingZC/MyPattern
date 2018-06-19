package com.zc.l09decorator;

// 装饰器基类
public class HouseDecoratorBase implements House
{
    // 持有house
    protected House house;

    public HouseDecoratorBase(House house)
    {
        this.house = house;
    }

    @Override
    public String makeHouse()
    {
        return house.makeHouse();
    }

}
