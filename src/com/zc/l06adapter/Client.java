package com.zc.l06adapter;

/**
 * Client客户端  希望使用三孔插头(Plug)  插入  两孔插座 (Socket) 
 * @author  zhangcheng
 * @version  [版本号, 2017年7月17日]
 */
public class Client
{
    private static Socket adaptSocket;

    public static void main(String[] args)
    {
        adaptSocket = new Adapter();
        System.out.println(adaptSocket.getInput());
    }
}
