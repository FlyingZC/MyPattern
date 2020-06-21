package com.zc.l07bridge.tv;

/**
 * @author flyingzc
 * 自动遥控器 抽象遥控器的一种实现 自动换台
 */
public class TVRemoteControlAuto extends TVRemoteControl {
    private int currentChannel;

    public void nextChannel() {
        currentChannel++;
        setChannel(currentChannel);
    }

    public void prevChannel() {
        currentChannel--;
        setChannel(currentChannel);
    }

    @Override
    public String toString() {
        return "自动遥控器";
    }
}
