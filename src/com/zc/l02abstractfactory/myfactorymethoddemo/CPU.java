package com.zc.l02abstractfactory.myfactorymethoddemo;

public class CPU
{
    @Override
    public String toString()
    {
       return "通用CPU";
    }
}

class IntelCPU extends CPU
{

    @Override
    public String toString()
    {
       return "IntelCPU";
    }
    
}

class AmdCPU extends CPU
{
 
    @Override
    public String toString()
    {
       return "AmdCPU";
    }
    
}