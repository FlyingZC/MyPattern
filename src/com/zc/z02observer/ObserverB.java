package com.zc.z02observer;

//观察者A,用户A
public class ObserverB implements Observer {
    private Subject subject;

    public ObserverB(Subject subject) {
        this.subject = subject;
        //本类对象注册为观察者
        subject.registObserver(this);
    }

    @Override
    public void update(String msg) {
        System.out.println("观察者(用户B)很开心收到信息:" + msg);
    }

}
