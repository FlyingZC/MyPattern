package com.zc.l23visitor;

public class VisitableString implements Visitable
{
    private String value;
    public VisitableString(String string)
    {
        value=string;
    }
    @Override
    public void accept(Visitor visitor)
    {
        visitor.visitString(this.value);
    }

}
