package com.zc.l23visitor.my;

/**
 * @author flyingzc
 * 客户端
 */
public class Client
{
    public static void main(String[] args)
    {
        StudentCustomer stu = new StudentCustomer();
        stu.setName("zc");
        stu.setJob("学生");
        
        TeacherCustomer teacher = new TeacherCustomer();
        teacher.setName("xdd");
        teacher.setJob("教师");
        
        ObjectStructure struct = new ObjectStructure();
        struct.addElement(stu);
        struct.addElement(teacher);
        
        SendMoneyVisitor moneyV = new SendMoneyVisitor();
        SendNewsVisitor sendV = new SendNewsVisitor();
        
        struct.handleRequest(moneyV);
        struct.handleRequest(sendV);
        
    }
}
