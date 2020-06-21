package com.zc.l09decorator.my;

public class DecoratorD extends Decorator {

    public DecoratorD(Obj obj) {
        super(obj);
    }

    @Override
    protected String getSum() {
        return super.getSum() + " + 被D装饰";
    }

}
