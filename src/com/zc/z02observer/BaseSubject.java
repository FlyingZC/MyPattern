package com.zc.z02observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 一个具体的主题
 * 相当于具体的公众号
 */
public class BaseSubject implements Subject {
    //所有观察者,用户
    private List<Observer> observers = new ArrayList<Observer>();
    //要推送的信息
    private String msg;

    @Override
    public void registObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if (index >= 0) {
            observers.remove(index);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(msg);//分别调用每个观察者中的update方法,推送信息
        }
    }

    /**
     * 主题更新消息
     */
    public void setMsg(String msg) {
        this.msg = msg;
        notifyObservers();//每当发送信息时会调用所有观察者的update方法
    }

}
