package com.zc.l23visitor.my;

public class SendMoneyVisitor implements Visitor {

    @Override
    public void visit(CustomerBase customer) {

    }

    @Override
    public void visitStudent(StudentCustomer student) {
        System.out.println("==开始发送奖金业务==" );

        System.out.println("你是一位学生,没有奖金,呵呵" );

        System.out.println("==发送奖金业务结束==" );
        System.out.println();

    }

    @Override
    public void visitTeacher(TeacherCustomer teacher) {
        System.out.println("==开始发送奖金业务==" );

        System.out.println("您是一位老师,奖金为0,哈哈" );

        System.out.println("==发送奖金业务结束==" );
        System.out.println();

    }

}
