package com.zc.l19observer.my;

public class Test
{
    public static void main(String[] args)
    {
        Observer a = new ObserverA();
        Observer b = new ObserverB();
        Subject subject = new Subject();
        subject.regist(a);
        subject.regist(b);
        subject.notice();
    }
}
