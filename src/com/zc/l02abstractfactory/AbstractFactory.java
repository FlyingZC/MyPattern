package com.zc.l02abstractfactory;
//抽象工厂类
public abstract class AbstractFactory {
   abstract Color getColor(String color);
   abstract Shape getShape(String shape) ;
}