package com.zc.l09decorator;

/**
 * @author flyingzc
 * 装饰灯 加 宝石
 */
public class LightGemDecorator extends LightDecorator
{

    public LightGemDecorator(House house)
    {
        super(house);
    }

    private String addGem()
    {
        return " + 镶嵌宝石";
    }

    @Override
    public String makeHouse()
    {
        return super.makeHouse() + addGem();
    }
}
