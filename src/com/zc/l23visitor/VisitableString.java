package com.zc.l23visitor;

/**
 * @author flyingzc
 * 具体被访问者
 */
public class VisitableString implements Visitable
{
    private String value;

    public VisitableString(String string)
    {
        value = string;
    }

    @Override
    public void accept(Visitor visitor)
    {
        visitor.visitString(this.value);
    }

}
