package com.zc.l13COR;

public class ChainOfResponsibilityExample
{
    public static void main(String[] args)
    {
        //创建责任链
        Logger logger1, logger2, logger3;
        logger1 = new StdoutLogger(LoggerLevel.DEBUG);
        logger2 = logger1.setNext(new EmailLogger(LoggerLevel.NOTICE));
        logger3 = logger2.setNext(new StderrLogger(LoggerLevel.ERR));
        
        System.out.println("--将当前日志等级设为DEBUG时--");
        //由StdoutLogger进行处理
        logger1.message("msg", LoggerLevel.DEBUG);
        
        System.out.println("--将当前日志等级设为NOTICE时--");
        //由StdoutLogger和EmailLogger进行处理
        logger1.message("msg", LoggerLevel.NOTICE);
        
        System.out.println("--将当前日志等级设为ERR时--");
        //由全部三个处理器一起进行处理
        logger1.message("msg", LoggerLevel.ERR);
    }
}
