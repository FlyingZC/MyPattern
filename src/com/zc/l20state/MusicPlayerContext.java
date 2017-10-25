package com.zc.l20state;

/**具体内容类,音乐播放器*/
public class MusicPlayerContext implements MusicPlayerContextInterface
{
    //通过改变MusicPlayerContext(音乐播放器)中的State属性,控制MusicPlayerContext类的不同行为
    //该(状态)属性可在运行时 与 另一个不同的对象重新绑定起来,即state属性的引用可在MusicPlayerContext中被替代,行为也会随之改变
    private State state;

    public MusicPlayerContext(State state)
    {
        this.state = state;
    }

    @Override
    public void requestPlay()
    {
        System.out.println("点按钮");
        state.pressPlay(this);
    }

    @Override
    public void setState(State state)
    {
        System.out.println("播放器状态设置为" + state);
        this.state = state;
    }

    @Override
    public State getState()
    {
        return state;
    }

}
