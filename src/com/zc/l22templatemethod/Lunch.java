package com.zc.l22templatemethod;
//午饭,模板方法
public abstract class Lunch
{
    public final void preprareLunch(){
        prepareFood();
        cooking();
        eating();
        cleaning();
        
    }
    public abstract void prepareFood();
    public abstract void cooking();
    public void eating(){
        System.out.println("I am eating.");
    }
    public abstract void cleaning();

}
