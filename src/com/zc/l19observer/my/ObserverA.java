package com.zc.l19observer.my;

public class ObserverA implements Observer {

    @Override
    public void update(Subject subject) {
        System.out.println("观察者A收到通知" );
    }

}
