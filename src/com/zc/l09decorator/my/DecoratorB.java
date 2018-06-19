package com.zc.l09decorator.my;

public class DecoratorB extends Decorator
{

    public DecoratorB(Obj obj)
    {
        super(obj);
    }
    
    @Override
    protected String getSum()
    {
        return super.getSum() + " + 被B装饰";
    }
    
}
