package com.zc.l14command;

//关闭空调的具体命令
public class StopCommand implements Command
{
    private AirConditioner airConditioner;

    public StopCommand(AirConditioner airConditioner)
    {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute()
    {
        airConditioner.stop();
    }

}
