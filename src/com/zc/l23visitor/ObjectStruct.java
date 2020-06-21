package com.zc.l23visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author flyingzc
 * 持有acceptors(被访问者集合)
 */
public class ObjectStruct {

    /**
     * 被访问者集合
     */
    private List<Visitable> list = new ArrayList<Visitable>();

    /**
     * 依次调用每个 被访问者的 accept()方法
     *
     * @param visitor
     */
    public void handle(Visitor visitor) {
        for (Visitable acceptor : list) {
            acceptor.accept(visitor);
        }
    }

    /**
     * 添加 被访问者
     *
     * @param acceptor
     */
    public void addElement(Visitable acceptor) {
        this.list.add(acceptor);
    }
}
