package com.zc.l23visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author flyingzc
 * 持有acceptors(被访问者集合)
 */
public class ObjectStruct
{
    private List<Visitable> list = new ArrayList<Visitable>();
    
    public void handle(Visitor visitor)
    {
        for (Visitable acceptor : list)
        {
            acceptor.accept(visitor);
        }
    }
    
    public void addElement(Visitable acceptor)
    {
        this.list.add(acceptor);
    }
}
