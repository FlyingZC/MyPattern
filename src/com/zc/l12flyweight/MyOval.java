package com.zc.l12flyweight;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

//具体享元角色 圆形.其内蕴状态为形状标签label	圆形为O
public class MyOval implements MyShape
{
    private String label;

    public MyOval(String label)
    {
        System.out.println("MyOval的构造方法");
        this.label = label;
    }

    @Override
    public void draw(Graphics g, int x, int y, int width, int height, Color color, boolean fill, String font)
    {
        g.setColor(color);
        g.drawOval(x, y, width, height);
        g.setFont(new Font(font, 12, 12));
        g.drawString(label, x + (width / 2), y);
        if (fill)
        {
            g.fillOval(x, y, width, height);
        }
    }

}
