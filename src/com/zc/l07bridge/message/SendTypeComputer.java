package com.zc.l07bridge.message;

public class SendTypeComputer implements SendType
{

    @Override
    public void send(String msg, String receiver)
    {
        System.out.println("电脑发送-" + msg);
    }

}
