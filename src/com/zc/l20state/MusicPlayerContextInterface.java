package com.zc.l20state;

//音乐内容接口
public interface MusicPlayerContextInterface
{
    //State state;
    /** 
     *点播放器按钮,切换播放和暂停两种状态
     */
    void requestPlay();

    void setState(State state);

    State getState();
}
