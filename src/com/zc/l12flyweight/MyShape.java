package com.zc.l12flyweight;

import java.awt.Color;
import java.awt.Graphics;

//抽象享元角色.具有一个内蕴状态,即形状标签(label)
public interface MyShape
{
    public void draw(Graphics g, int x, int y, int width, int height, Color color, boolean fill, String font);
}
