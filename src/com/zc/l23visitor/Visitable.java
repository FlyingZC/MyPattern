package com.zc.l23visitor;

/**
 * @author flyingzc
 * 被访问接口
 */
public interface Visitable {
    /**
     * 接收访问
     *
     * @param visitor
     */
    public void accept(Visitor visitor);
}
