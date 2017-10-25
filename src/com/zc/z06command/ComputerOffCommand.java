package com.zc.z06command;

/** 
 * 关电脑的命令 
 * @author zc
 * 
 */  
public class ComputerOffCommand implements Command  
{  
    private Computer computer ;   
      
    public ComputerOffCommand( Computer computer)  
    {  
        this.computer = computer;  
    }  
  
    @Override  
    public void execute()  
    {  
        computer.off();  
    }  
}  