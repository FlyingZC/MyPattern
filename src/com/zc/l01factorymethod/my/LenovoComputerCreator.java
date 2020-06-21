package com.zc.l01factorymethod.my;

public class LenovoComputerCreator extends ComputerCreator {

    @Override
    protected CPU chooseCPU() {
        return new IntelCPU();
    }

    @Override
    protected KeyBoard chooseKeyBoard() {
        return new LogitechKeyBorad();
    }

    @Override
    protected String chooseLogo() {
        return "Lenovo电脑";
    }

}
