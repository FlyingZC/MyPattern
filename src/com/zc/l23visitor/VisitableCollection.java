package com.zc.l23visitor;

import java.util.List;

/**
 * @author flyingzc
 * 具体被访问者
 */
public class VisitableCollection implements Visitable {
    private List<Visitable> list;

    public VisitableCollection(List<Visitable> list) {
        this.list = list;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitCollection(this.list);
    }

}
