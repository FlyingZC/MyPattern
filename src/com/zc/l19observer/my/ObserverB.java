package com.zc.l19observer.my;

public class ObserverB implements Observer {

    @Override
    public void update(Subject subject) {
        System.out.println("观察者B收到通知" );
    }

}
