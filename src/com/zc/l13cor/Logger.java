package com.zc.l13cor;

public abstract class Logger
{
    /**
     * 当前日志类 对应的日志级别,在子类构造器时传入
     */
    protected LoggerLevel mask;

    //链中的下一个元素
    protected Logger next;

    public Logger setNext(Logger log)
    {
        next = log;
        return log;
    }

    /**
     * 输出日志信息
     * @param msg 打印的日志
     * @param priorityLevel 当前的全局日志级别
     */
    public void message(String msg, LoggerLevel priorityLevel)
    {
        //若 当前类的日志级别 大于等于 当前全局日志级别
        if (priorityLevel.getWeight() <= mask.getWeight())
        {
            writeMessage(msg);
        }
        if (next != null)
        {   //递归调用下个节点 的本方法
            next.message(msg, priorityLevel);
        }
    }

    /**
     * 写日志,子类实现
     * @param msg
     */
    abstract protected void writeMessage(String msg);
}
