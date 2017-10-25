package com.zc.l02abstractfactory.myabstractfactorydemo;

public class DellComputerFactory implements AbstractFactory
{

    @Override
    public ComputerComponent createComponent(ComponentType type)
    {
        if (ComponentType.CPU.equals(type))
        {
            return new IntelCPU();
        }
        if (ComponentType.MainBoard.equals(type))
        {
            return new DellMainBoard();
        }
        return null;
    }

}
