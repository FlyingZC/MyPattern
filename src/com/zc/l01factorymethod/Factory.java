package com.zc.l01factorymethod;

public abstract class Factory {
    /**
     * 各个具体的工厂子类实现. 工厂方法 把选择实现 延迟到了该子类中
     *
     * @return
     */
    protected abstract Product factoryMethod();

    public Product getInstance() {
        return factoryMethod();
    }
}
