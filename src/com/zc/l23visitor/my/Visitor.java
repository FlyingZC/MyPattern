package com.zc.l23visitor.my;

/**
 * @author flyingzc
 * 访问者接口
 */
public interface Visitor
{
    /**
     * 访问 被访问者的方法,这个抽象方法可以由以下几个进行替代.
     * @param customer
     */
    public void visit(CustomerBase customer);
    
    /**
     * 访问学生
     * @param student
     */
    public void visitStudent(StudentCustomer student);
    
    /**
     * 访问老师
     * @param teacher
     */
    public void visitTeacher(TeacherCustomer teacher);
    
}
