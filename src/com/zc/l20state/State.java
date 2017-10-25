package com.zc.l20state;

/**播放器状态,具体有 播放状态 和 暂停状态*/
public interface State
{
    /**用于改变播放器状态*/
    public void pressPlay(MusicPlayerContextInterface context);
}
