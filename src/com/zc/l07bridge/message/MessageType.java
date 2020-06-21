package com.zc.l07bridge.message;

/**
 * @author flyingzc
 * 消息类型.普通消息,加急消息,特急消息
 */
public abstract class MessageType {
    private SendType sender;

    public MessageType(SendType sender) {
        this.sender = sender;
    }

    public void send(String msg, String receiver) {
        this.sender.send(msg, receiver);
    }
}
