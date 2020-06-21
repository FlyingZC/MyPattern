package com.zc.l01factorymethod.my;

public class CPU {
    @Override
    public String toString() {
        return "通用CPU";
    }
}

class IntelCPU extends CPU {

    @Override
    public String toString() {
        return "IntelCPU";
    }

}

class AmdCPU extends CPU {

    @Override
    public String toString() {
        return "AmdCPU";
    }

}