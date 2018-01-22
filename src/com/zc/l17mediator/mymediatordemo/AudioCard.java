package com.zc.l17mediator.mymediatordemo;

import com.zc.l17mediator.mymediatordemo.Colleague;
import com.zc.l17mediator.mymediatordemo.MainBoardMediator;

/**
 * @author flyingzc
 * 声卡
 *
 */
public class AudioCard extends Colleague
{

    public AudioCard(MainBoardMediator mediator)
    {
        super(mediator);
    }

    public void play(String audioData)
    {
        System.out.println("播放音频:"+audioData);
    }

}
