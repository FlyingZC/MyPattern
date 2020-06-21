package com.zc.l09decorator.my;

/**
 * @author flyingzc
 * 装饰者基类
 */
public class Decorator extends Obj {
    private Obj obj;

    public Decorator(Obj obj) {
        this.obj = obj;
    }

    @Override
    protected String getSum() {
        return obj.getSum();
    }

}
