package com.zc.l02abstractfactory.sun;

/**
 * @author flyingzc
 * 创建 "太阳" 的 工厂.需要 红色 和 圆形
 */
public class SunFactory extends AbstractFactory {

    @Override
    Color getColor(String color) {
        return new Red();
    }

    @Override
    Shape getShape(String shape) {
        return new Circle();
    }

}
