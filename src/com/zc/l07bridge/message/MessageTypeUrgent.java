package com.zc.l07bridge.message;

/**
 * @author flyingzc
 * 加急消息
 */
public class MessageTypeUrgent extends MessageType
{

    public MessageTypeUrgent(SendType sender)
    {
        super(sender);
    }

    @Override
    public void send(String msg, String receiver)
    {
        msg = "加急:" + msg;
        super.send(msg, receiver);
    }
}
