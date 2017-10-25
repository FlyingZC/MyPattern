package com.zc.z06command;
//关闭电灯的命令
public class LightOffCommand implements Command{
	private Light light;
	//构造方法
	public LightOffCommand(Light light){
		this.light=light;
	}
	@Override
	public void execute() {
		light.off();
	}
	
}
