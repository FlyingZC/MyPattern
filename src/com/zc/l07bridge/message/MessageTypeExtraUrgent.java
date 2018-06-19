package com.zc.l07bridge.message;

/**
 * @author flyingzc
 * 特急消息
 */
public class MessageTypeExtraUrgent extends MessageType
{

    public MessageTypeExtraUrgent(SendType sender)
    {
        super(sender);
    }

    @Override
    public void send(String msg, String receiver)
    {
        msg = "特急:" + msg;
        super.send(msg, receiver);
    }
}
