package com.zc.l23visitor.my;

/**
 * @author flyingzc
 * 老师客户,被访问者实现2
 */
public class TeacherCustomer extends CustomerBase {

    @Override
    protected void accept(Visitor visitor) {
        visitor.visitTeacher(this);

    }

}
