package com.zc.l07bridge.message;

/**
 * @author flyingzc
 * 发送方式.手机发送,电脑发送,邮件发送
 */
public interface SendType {

    void send(String msg, String receiver);

}
