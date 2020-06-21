package com.zc.l07bridge.tv;

//遥控器抽象基类
public abstract class TVRemoteControl {
    protected TV implementor;

    public void setTV(TV tv) {
        implementor = tv;
        System.out.println("使用" + this + "操作" + tv);
    }

    public void powerOn() {
        implementor.powerOn();
    }

    public void powerOff() {
        implementor.powerOff();
    }

    public void setChannel(int channel) {
        implementor.changeChannel(channel);
    }

}
