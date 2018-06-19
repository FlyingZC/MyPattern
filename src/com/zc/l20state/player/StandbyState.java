package com.zc.l20state.player;

/**暂停状态,可以有播放按键*/
public class StandbyState implements State
{
    /**暂停状态下点按钮,相当于设置为播放状态playingState*/
    @Override
    public void pressPlay(MusicPlayerContextInterface context)
    {
        // 将状态改为播放状态
        context.setState(new PlayingState());
    }

    @Override
    public String toString()
    {
        return "处于暂停状态";
    }
}
