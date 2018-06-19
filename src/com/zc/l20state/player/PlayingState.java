package com.zc.l20state.player;

/**播放状态*/
public class PlayingState implements State
{
    /**播放状态下按pressPlay按钮,相当于点暂停*/
    @Override
    public void pressPlay(MusicPlayerContextInterface context)
    {
        context.setState(new StandbyState());
    }

    @Override
    public String toString()
    {
        return "处于播放状态";
    }
}
