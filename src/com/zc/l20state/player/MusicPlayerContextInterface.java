package com.zc.l20state.player;

// 音乐上下文接口.Context上下文通常用于定义客户感兴趣的接口,同时维护一个来处理当前状态的实例对象
public interface MusicPlayerContextInterface
{
    //State state;
    /** 
     * 点播放器按钮,切换播放和暂停两种状态
     */
    void requestPlay();

    void setState(State state);

    State getState();
}
