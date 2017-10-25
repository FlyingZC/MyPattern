package com.zc.l07bridge;
//遥控器抽象基类
public abstract class TVRemoteControl {
	protected TV implementor;
	public void setTV(TV tv){
		implementor=tv;
	}
	public void powerOn(){
		implementor.powerOn();
	}
	public void powerOff(){
		implementor.powerOff();
	}
	public void setChannel(int channel){
		implementor.changeChannel(channel);
	}
}
