package com.zc.l07bridge.tv;

/**
 * @author flyingzc
 * 随机遥控器 抽象遥控器的一种实现 随机换台
 */
public class TVRemoteControlRandom extends TVRemoteControl
{
    private int currentChannel;

    private boolean needAdd;

    public void setRandomChannel()
    {
        currentChannel = needAdd ? currentChannel + 2 : currentChannel - 1;
        needAdd = !needAdd;
        setChannel(currentChannel);
    }

    @Override
    public String toString()
    {
        return "随机遥控器";
    }
}
