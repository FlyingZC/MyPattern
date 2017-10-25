package com.zc.l02abstractfactory.myfactorymethoddemo;

public class DellComputerCreator extends ComputerCreator
{

    @Override
    protected CPU chooseCPU()
    {
        return new IntelCPU();
    }

    @Override
    protected KeyBoard chooseKeyBoard()
    {
        return new DellKeyBoard();
    }

    @Override
    protected String chooseLogo()
    {
        return "Dell电脑";
    }

}
