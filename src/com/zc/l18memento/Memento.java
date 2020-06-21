package com.zc.l18memento;

/**
 * <备忘录>
 * <保存编辑内容>
 *
 * @author zc
 * @version [版本号, 2016年12月22日]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class Memento {
    // 用于保存备忘录的状态
    private String state;

    public Memento(String stateToSave) {
        state = stateToSave;
    }

    public String getSavedState() {
        return state;
    }
}
