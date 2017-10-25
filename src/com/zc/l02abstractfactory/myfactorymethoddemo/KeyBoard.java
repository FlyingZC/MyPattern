package com.zc.l02abstractfactory.myfactorymethoddemo;

public class KeyBoard
{
    @Override
    public String toString()
    {
       return "通用键盘";
    }
}

class LogitechKeyBorad extends KeyBoard
{
    @Override
    public String toString()
    {
       return "LogitechKeyBorad";
    }
}

class DellKeyBoard extends KeyBoard
{
    @Override
    public String toString()
    {
       return "DellKeyBoard";
    }
}