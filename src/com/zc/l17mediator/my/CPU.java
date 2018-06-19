package com.zc.l17mediator.my;

public class CPU extends Colleague
{

    public CPU(MainBoardMediator mediator)
    {
        super(mediator);
    }
    
    String videoData = "";
    String audioData = "";
    /**
     * cpu处理数据
     * @param cdData
     */
    public void handleData(String cdData)
    {
        if(cdData !=null && cdData.length()>0)
        {
            String[] dataArray = cdData.split(",");
            if(dataArray.length == 2)
            {
                videoData = dataArray[0];
                audioData = dataArray[1];
            }
        }
        //步骤3
        super.getMediator().notification(this);
    }
    
    public String getVideoData()
    {
        return videoData;
    }
    public void setVideoData(String videoData)
    {
        this.videoData = videoData;
    }
    public String getAudioData()
    {
        return audioData;
    }
    public void setAudioData(String audioData)
    {
        this.audioData = audioData;
    }

}
