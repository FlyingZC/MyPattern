package com.zc.z06command;

public class NoCommand implements Command  
{  
    @Override  
    public void execute()  
    {  
    	System.out.println("未指定命令");
    }  
}  