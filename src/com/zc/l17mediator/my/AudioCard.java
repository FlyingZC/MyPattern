package com.zc.l17mediator.my;

import com.zc.l17mediator.my.Colleague;
import com.zc.l17mediator.my.MainBoardMediator;

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
