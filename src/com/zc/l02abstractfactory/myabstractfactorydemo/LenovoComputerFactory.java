package com.zc.l02abstractfactory.myabstractfactorydemo;

public class LenovoComputerFactory implements AbstractFactory
{

    @Override
    public ComputerComponent createComponent(ComponentType type)
    {
        if (ComponentType.CPU.equals(type))
        {
            return new AmdCPU();
        }
        if (ComponentType.MainBoard.equals(type))
        {
            return new JiJiaMainBoard();
        }
        return null;
    }
}
