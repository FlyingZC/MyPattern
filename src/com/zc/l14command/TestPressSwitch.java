package com.zc.l14command;

public class TestPressSwitch {
    public static void main(String[] args) {
        AirConditioner airConditioner = new AirConditioner();
        Command switchOn = new StartCommand(airConditioner);
        Command switchOff = new StopCommand(airConditioner);
        Switch sw = new Switch();
        //调用者执行开空调操作
        sw.storeAndExecute(switchOn);
        sw.storeAndExecute(switchOff);
    }
}
