package com.zc.l01factorymethod.my;

public class ClientBuyComputer {
    public static void main(String[] args) {
        Computer dellComputer = ComputerCreator.assembleComputer(new DellComputerCreator());
        System.out.println(dellComputer);

        Computer lenovoComputer = ComputerCreator.assembleComputer(new LenovoComputerCreator());
        System.out.println(lenovoComputer);
    }
}
