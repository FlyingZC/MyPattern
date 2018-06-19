package com.zc.l12flyweight;

import java.util.HashMap;
import java.util.Map;

//享元工厂角色.用于维护享元角色,根据客户端的请求对其进行管理和分配
public class ShapeFactory
{
    private static final Map<String, MyShape> shapes = new HashMap<String, MyShape>();

    public static MyShape getShape(String label)
    {
        // 从集合中获取shape
        MyShape shape = shapes.get(label);
        if (shape == null)
        {   
            // 若没有,则创建该shape并放入map中.map中只有两对k-v
            if (label.equals("R"))
            {
                shape = new MyRectangle(label);
            }
            else if (label.equals("O"))
            {
                shape = new MyOval(label);
            }
        }
        shapes.put(label, shape);
        return shape;
    }
}
