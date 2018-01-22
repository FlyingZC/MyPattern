package com.zc.l19observer.myobserverdemo;

import java.util.ArrayList;
import java.util.List;

public class Subject
{
    private List<Observer> observers = new ArrayList<Observer>();
    
    public void regist(Observer observer)
    {
        this.observers.add(observer);
    }
    
    public void remove(Observer observer)
    {
        this.observers.remove(observer);
    }
    
    public void notice()
    {
        for(Observer observer : observers)
        {
            //通知 所有 观察者.关键在于将Subject传入
            observer.update(this);
        }
    }
}
