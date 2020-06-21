package com.zc.l12flyweight;

import java.awt.*;

//具体享元角色 矩形.其内蕴状态为形状标签label	矩形为R
public class MyRectangle implements MyShape {
    private String label;

    public MyRectangle(String label) {
        System.out.println("MyRectangle的构造方法" );
        this.label = label;
    }

    @Override
    public void draw(Graphics g, int x, int y, int width, int height, Color color, boolean fill, String font) {
        g.setColor(color);
        g.drawRect(x, y, width, height);
        g.setFont(new Font(font, 12, 12));
        g.drawString(label, x + (width / 2), y);
        if (fill) {
            g.fillRect(x, y, width, height);
        }
    }

}
