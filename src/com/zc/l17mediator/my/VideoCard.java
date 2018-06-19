package com.zc.l17mediator.my;

/**
 * @author flyingzc
 * 显卡
 */
public class VideoCard extends Colleague
{

    public VideoCard(MainBoardMediator mediator)
    {
        super(mediator);
    }

    public void play(String videoData)
    {
      System.out.println("播放视频:"+videoData);  
    }

}
