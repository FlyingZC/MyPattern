package com.zc.l09decorator;

// 用于增加装饰器的基类(被装饰者)
public class SimpleHouse implements House {
    @Override
    public String makeHouse() {
        return "一个简单的房子";
    }

}
