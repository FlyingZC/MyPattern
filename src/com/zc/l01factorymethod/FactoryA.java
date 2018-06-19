package com.zc.l01factorymethod;

/**
 * @author flyingzc
 * 具体工厂,工厂方法 把选择实现 延迟到了该子类中
 */
public class FactoryA extends Factory
{
    @Override
    protected Product factoryMethod()
    {
        return new ConcreteProduct();
    }

}
