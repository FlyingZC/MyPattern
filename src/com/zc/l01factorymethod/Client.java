package com.zc.l01factorymethod;

public class Client
{
    public static void main(String[] args)
    {
        // 工厂方法模式的缺点 工厂和具体工厂实现耦合了.客户端必须知道具体的工厂实现
        Factory factory = new FactoryA();
        System.out.println(factory.getInstance());
    }
}
