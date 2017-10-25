package com.zc.l13COR;

public class StdoutLogger extends Logger
{
    public StdoutLogger(LoggerLevel mask)
    {
        this.mask = mask;
    }

    @Override
    protected void writeMessage(String msg)
    {
        System.out.println("[" + mask + "] " + "StdoutLogger日志信息" + msg);
    }
}
