package com.zc.l01factorymethod.my;

/**
 * 组装电脑:使用 工厂方法实现 factory method
 * 工厂方法基类
 *
 * @author Flyingzc
 */
public abstract class ComputerCreator {
    /**
     * 组装电脑 暴露给客户端的api
     */
    public static Computer assembleComputer(ComputerCreator creator) {
        Computer computer = new Computer();
        computer.setCpu(creator.chooseCPU());
        computer.setKeyBoard(creator.chooseKeyBoard());
        computer.setLogo(creator.chooseLogo());
        return computer;
    }

    protected abstract CPU chooseCPU();

    protected abstract KeyBoard chooseKeyBoard();

    protected abstract String chooseLogo();
}
