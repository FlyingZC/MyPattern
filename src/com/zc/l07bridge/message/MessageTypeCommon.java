package com.zc.l07bridge.message;

public class MessageTypeCommon extends MessageType {

    public MessageTypeCommon(SendType sender) {
        super(sender);
    }

    @Override
    public void send(String msg, String receiver) {
        // 普通消息不做特殊处理
        super.send(msg, receiver);
    }
}
