package com.zc.l13COR;

public enum LoggerLevel
{
    //权重越高,越难以被打印
    ERR(7),NOTICE(5),DEBUG(3);
    
    private LoggerLevel()
    {
        
    }
    
    private int weight;
    
    private LoggerLevel(int weight)
    {
        this.weight = weight;
    }

    public int getWeight()
    {
        return weight;
    }

    public void setWeight(int weight)
    {
        this.weight = weight;
    }
    
}
