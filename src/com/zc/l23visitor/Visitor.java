package com.zc.l23visitor;

import java.util.Collection;

public interface Visitor
{
    public void visitCollection(Collection collection);
    public void visitString(String string);
    public void visitInteger(Integer integer);
}
