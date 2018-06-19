package com.zc.l23visitor.my;

/**
 * @author flyingzc
 * 向客户发送消息的 业务,访问者实现1
 */
public class SendNewsVisitor implements Visitor
{

    @Override
    public void visit(CustomerBase customer)
    {
        System.out.println("==开始向客户发送短信息==");
        System.out.println("亲爱的" + customer.getName() + ",职位" + customer.getJob());
        System.out.println("以下是根据您的职位进行的信息推送");
        
        if (customer instanceof StudentCustomer)
        {
            System.out.println("祝您作为学生生活愉快,学业进步");
        }
        else if (customer instanceof TeacherCustomer)
        {
            System.out.println("祝您作为老师工作顺利");
        }
        
        System.out.println("==短信结束==");
        System.out.println();
    }

    @Override
    public void visitStudent(StudentCustomer student)
    {
        sendHeader(student);
        System.out.println("祝您作为学生生活愉快,学业进步");
        sendTail(student);
    }

    @Override
    public void visitTeacher(TeacherCustomer teacher)
    {
        sendHeader(teacher);
        System.out.println("祝您作为老师工作顺利");
        sendTail(teacher);
    }
    
    public void sendHeader(CustomerBase customer)
    {
        System.out.println("==开始向客户发送短信息==");
        System.out.println("亲爱的" + customer.getName() + ",职位" + customer.getJob());
        System.out.println("以下是根据您的职位进行的信息推送");
    }

    public void sendTail(CustomerBase customer)
    {
        System.out.println("==短信结束==");
        System.out.println();
    }
}
