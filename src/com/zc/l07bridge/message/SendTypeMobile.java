package com.zc.l07bridge.message;

public class SendTypeMobile implements SendType
{

    @Override
    public void send(String msg, String receiver)
    {
        System.out.println("手机发送-" + msg);
    }

}
