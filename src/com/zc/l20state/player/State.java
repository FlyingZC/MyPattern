package com.zc.l20state.player;

/**
 * 播放器状态,具体有 播放状态 和 暂停状态
 * 状态接口.用于封装与上下文的一个特定状态所对应的行为
 * */
public interface State
{
    /**用于改变播放器状态*/
    public void pressPlay(MusicPlayerContextInterface context);
}
