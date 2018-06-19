package com.zc.l09decorator.my;

public class DecoratorC extends Decorator
{

    public DecoratorC(Obj obj)
    {
        super(obj);
    }
    
    @Override
    protected String getSum()
    {
        return super.getSum() + " + 被C装饰";
    }
    
}
