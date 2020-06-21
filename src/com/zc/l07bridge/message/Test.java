package com.zc.l07bridge.message;

public class Test {
    /**
     * 两个不同维度的组合,将这两个维度分别定义成接口,分别有实现类.再组合起来
     * 1.消息类型:
     * 2.消息发送方式:
     */
    public static void main(String[] args) {
        SendType sender = new SendTypeEmail();
        MessageType msgType = new MessageTypeExtraUrgent(sender);// 加急  + 发送email
        msgType.send("这是一条短消息!" , "zz" );

        sender = new SendTypeMobile();
        msgType = new MessageTypeCommon(sender);// 普通 + 手机发送
        msgType.send("这是一条短消息!" , "zx" );
    }
}
