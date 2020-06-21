package com.zc.z04factory;

public class Fruit implements Food {
    @Override
    public void prepare() {
        System.out.println("准备" + this);
    }

    @Override
    public void pack() {
        System.out.println("打包" + this);
    }

    @Override
    public void fire() {
        System.out.println("拷贝" + this);
    }

}
