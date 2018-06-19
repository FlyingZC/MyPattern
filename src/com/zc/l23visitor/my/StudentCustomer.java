package com.zc.l23visitor.my;

/**
 * @author flyingzc
 * 学生客户,被访问者的具体实现1
 */
public class StudentCustomer extends CustomerBase
{

    @Override
    protected void accept(Visitor visitor)
    {
        visitor.visitStudent(this);

    }

}
