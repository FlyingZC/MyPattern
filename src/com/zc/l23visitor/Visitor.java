package com.zc.l23visitor;

import java.util.List;

/**
 * @author flyingzc
 * 访问者接口,定义访问操作
 */
public interface Visitor {
    public void visitCollection(List<Visitable> collection);

    public void visitString(String string);

    public void visitInteger(Integer integer);
}
