package com.zc.l07bridge.message;

public class SendTypeEmail implements SendType {

    @Override
    public void send(String msg, String receiver) {
        System.out.println("Email发送-" + msg);
    }

}
