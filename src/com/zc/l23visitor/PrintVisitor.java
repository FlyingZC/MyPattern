package com.zc.l23visitor;

import java.util.Collection;
import java.util.Iterator;

//具体访问者
public class PrintVisitor implements Visitor
{
    @Override
    public void visitCollection(Collection collection)
    {
        Iterator it = collection.iterator();
        while (it.hasNext())
        {
            Object o = it.next();
            if (o instanceof Visitable)
            {
                ((Visitable) o).accept(this);
            }
        }
    }

    @Override
    public void visitString(String string)
    {
        System.out.println("This is a string and its value is" + string.toString());
    }

    @Override
    public void visitInteger(Integer integer)
    {
        System.out.println("This is a Integer and its value is" + integer);
    }

}
