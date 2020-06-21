package com.zc.l13cor;

public class EmailLogger extends Logger {
    public EmailLogger(LoggerLevel mask) {
        this.mask = mask;
    }

    @Override
    protected void writeMessage(String msg) {
        System.out.println("[" + mask + "] " + "EmailLogger日志信息:" + msg);
    }

}
