package com.zc.l23visitor;

/**
 * @author flyingzc
 * 具体被访问者
 */
public class VisitableInteger implements Visitable
{
    private Integer value;

    public VisitableInteger(Integer value)
    {
        this.value = value;
    }

    @Override
    public void accept(Visitor visitor)
    {
        visitor.visitInteger(this.value);
    }

}
