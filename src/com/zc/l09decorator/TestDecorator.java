package com.zc.l09decorator;

public class TestDecorator
{
    public static void main(String[] args)
    {
        House house=new SimpleHouse();
        System.out.println(new ColorDecorator(house).makeHouse());
        System.out.println(new LightDecorator(house).makeHouse());
    }
}
