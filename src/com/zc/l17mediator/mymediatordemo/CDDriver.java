package com.zc.l17mediator.mymediatordemo;

public class CDDriver extends Colleague
{
    public String cdData; 
    
    public CDDriver(MainBoardMediator mainBoard)
    {
        super(mainBoard);
    }
    public void readData()
    {
        this.cdData = "videooooooo,audioooooooo";
        //1. 通知主板
        super.getMediator().notification(this);
    }
    public String getCdData()
    {
        return cdData;
    }
    public void setCdData(String cdData)
    {
        this.cdData = cdData;
    }
    
}
