package com.zc.l09decorator.my;

public class DecoratorA extends Decorator
{

    public DecoratorA(Obj obj)
    {
        super(obj);
    }
    
    @Override
    protected String getSum()
    {
        return super.getSum() + " + 被A装饰";
    }
}
