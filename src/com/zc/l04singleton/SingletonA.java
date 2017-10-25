package com.zc.l04singleton;

//饿汉式
public class SingletonA
{
    private static int count = 0;

    private static SingletonA instance = new SingletonA();

    private SingletonA()
    {
        System.out.println("SingletonA的构造方法");
        //设计成在第二次调用时抛异常
        count++;
        if (count > 1)
        {
            throw new RuntimeException("只能实例化一次");
        }
    }

    public static SingletonA getInstance()
    {
        return instance;
    }
}
