package com.zc.l18memento;

import java.util.ArrayList;
import java.util.List;

/**
 * <备忘录管理者.管理者>
 * <需要处理在何时,为何 对发起者进行数据保存和回滚 保存备忘录>
 *
 * @author zc
 * @version [版本号, 2016年12月22日]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class Caretaker {
    /**
     * 记录多个备忘录状态
     */
    private List<Memento> savedStates = new ArrayList<Memento>();

    public void addMemento(Memento m) {
        savedStates.add(m);
    }

    public Memento getMemento(int index) {
        return savedStates.get(index);
    }
}
