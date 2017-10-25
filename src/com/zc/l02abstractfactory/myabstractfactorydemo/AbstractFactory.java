package com.zc.l02abstractfactory.myabstractfactorydemo;

/**
 * @author Flyingzc
 * 可拓展的抽象工厂 接口
 *
 */
public interface AbstractFactory
{
    /**
     * 创建电脑组件
     * @param component
     * @return
     */
    public ComputerComponent createComponent(ComponentType type);
}
