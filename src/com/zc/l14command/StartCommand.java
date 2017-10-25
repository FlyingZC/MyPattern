package com.zc.l14command;
//开启空调的具体命令
public class StartCommand implements Command{
	private AirConditioner airConditioner;
	public StartCommand(AirConditioner airConditioner){
		this.airConditioner=airConditioner;
	}
	@Override
	public void execute() {//该命令 用于开启空调
		airConditioner.start();
	}

}
