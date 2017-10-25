package com.zc.l02abstractfactory.myabstractfactorydemo;

public class ComputerEngineer
{
    private CPU cpu;
    private MainBoard mainBoard;
    
    public Computer assembleComputer(AbstractFactory factory)
    {
        prepareComponent(factory);
        return null;
    }

    private void prepareComponent(AbstractFactory factory)
    {
        //遗憾的地方是,此处需要转型
        this.cpu = (CPU) factory.createComponent(ComponentType.CPU);
        this.mainBoard = (MainBoard) factory.createComponent(ComponentType.MainBoard);
    }
}
