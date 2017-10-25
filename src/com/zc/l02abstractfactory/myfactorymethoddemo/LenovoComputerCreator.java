package com.zc.l02abstractfactory.myfactorymethoddemo;

public class LenovoComputerCreator extends ComputerCreator
{

    @Override
    protected CPU chooseCPU()
    {
        return new IntelCPU();
    }

    @Override
    protected KeyBoard chooseKeyBoard()
    {
        return new LogitechKeyBorad();
    }

    @Override
    protected String chooseLogo()
    {
        return "Lenovo电脑";
    }

}
