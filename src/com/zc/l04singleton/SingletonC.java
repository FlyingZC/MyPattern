package com.zc.l04singleton;

// static修饰的内部类,与外部类之间相互独立,可直接创建.该内部类直到第一次使用时才会被装载
public class SingletonC
{
    private SingletonC()
    {

    }

    // 该静态内部类用于返回Singleton的instance.可延迟加载
    private static class SingletonHolder
    {
        private static final SingletonC instance = new SingletonC();
    }

    public static SingletonC getInstance()
    {
        return SingletonHolder.instance;
    }
}
