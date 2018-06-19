package com.zc.l07bridge.tv;

public class Test
{
    /**
     * 将 TV 和 换台 两个维度分开
     * @param args
     */
    public static void main(String[] args)
    {
        TVRemoteControlAuto control = new TVRemoteControlAuto();
        control.setTV(new GoogleTV());
        control.powerOn();
        control.nextChannel();
        control.nextChannel();
        control.nextChannel();
        control.nextChannel();
        control.nextChannel();
        control.nextChannel();
        control.powerOff();
        
        TVRemoteControlRandom control2 = new TVRemoteControlRandom();
        control2.setTV(new AndroidTV());
        control2.powerOn();
        control2.setRandomChannel();
        control2.setRandomChannel();
        control2.setRandomChannel();
        control2.setRandomChannel();
        control2.setRandomChannel();
        control2.setRandomChannel();
        control2.setRandomChannel();
        control2.setRandomChannel();
        control2.powerOff();
    }
}
