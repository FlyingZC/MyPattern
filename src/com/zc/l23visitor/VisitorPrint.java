package com.zc.l23visitor;

import java.util.Iterator;
import java.util.List;

//具体访问者
public class VisitorPrint implements Visitor
{
    @Override
    public void visitCollection(List<Visitable> collection)
    {
        System.out.println("遍历集合中的元素:");
        Iterator<Visitable> it = collection.iterator();
        while (it.hasNext())
        {
            Visitable o = it.next();
            o.accept(this);
        }
    }

    @Override
    public void visitString(String string)
    {
        System.out.println("This is a string and its value is " + string.toString());
    }

    @Override
    public void visitInteger(Integer integer)
    {
        System.out.println("This is a Integer and its value is " + integer);
    }

}
