package com.zc.l13cor;

public class StderrLogger extends Logger
{
    public StderrLogger(LoggerLevel mask)
    {
        this.mask = mask;
    }

    @Override
    protected void writeMessage(String msg)
    {
        System.out.println("[" + mask + "] " + "StderrLogger日志信息:" + msg);
    }

}
