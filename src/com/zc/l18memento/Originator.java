package com.zc.l18memento;

/**
 * <原发器,发起者(备忘录保存的信息来源于该类)>
 * <调用备忘录对象,也会包含不在备忘录中存储的额外数据>
 * 
 * @author  Administrator
 * @version  [版本号, 2016年12月22日]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class Originator
{
    private String state;

    /** <设置state>
     * <功能详细描述>
     * @param state
     * @see [类、类#方法、类#成员]
     */
    public void setState(String state)
    {
        System.out.println("原发器状态变更为: " + state);
        this.state = state;
    }

    /** <保存到备忘录>
     * @return
     * @see [类、类#方法、类#成员]
     */
    public Memento saveToMemento()
    {
        System.out.println("保存状态到备忘录: " + state);
        return new Memento(state);
    }

    public void restoreFromMemento(Memento m)
    {
        state = m.getSavedState();
        System.out.println("从备忘录中获取保存点 并 恢复到保存点: " + state);
    }
}
