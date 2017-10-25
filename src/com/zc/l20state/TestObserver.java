package com.zc.l20state;

//展示状态模式
public class TestObserver
{
    //1.使用StandbyState对象创建MusicPalyerContext
    public static void main(String[] args)
    { //初始化为暂停状态
        MusicPlayerContext musicPlayer = new MusicPlayerContext(new StandbyState());
        musicPlayer.requestPlay();
        musicPlayer.requestPlay();
    }
}
