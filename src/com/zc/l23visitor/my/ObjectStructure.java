package com.zc.l23visitor.my;

import java.util.ArrayList;
import java.util.List;

/**
 * @author flyingzc
 * 被访问者结构,包含被访问者集合.客户端通过传入 不同的访问者,调用对应的方法.
 */
public class ObjectStructure {
    /**
     * 被访问者集合
     */
    private List<CustomerBase> customs = new ArrayList<CustomerBase>();

    /**
     * 接收用户请求.用户传入不同的业务(visitor)
     */
    public void handleRequest(Visitor visitor) {
        for (CustomerBase c : customs) {
            c.accept(visitor);
        }
    }

    public void addElement(CustomerBase customer) {
        customs.add(customer);
    }

}
