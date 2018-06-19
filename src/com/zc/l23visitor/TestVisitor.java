package com.zc.l23visitor;

import java.util.ArrayList;
import java.util.List;

public class TestVisitor
{
    public static void main(String[] args)
    {
        Visitor visitor = new VisitorPrint();
        Visitable acceptor1 = new VisitableString("zc");
        Visitable acceptor2 = new VisitableInteger(11);
        
        List<Visitable> list = new ArrayList<Visitable>();
        list.add(acceptor1);
        list.add(acceptor2);
        Visitable acceptor3 = new VisitableCollection(list);
        
        ObjectStruct struct = new ObjectStruct();
        struct.addElement(acceptor1);
        struct.addElement(acceptor2);
        struct.addElement(acceptor3);
        struct.handle(visitor);
    }
}
