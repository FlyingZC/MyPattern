package com.zc.l18memento;

/**
 * <发起者>
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
    public void setState(String state){
        System.out.println("Setting state to"+state);
        this.state=state;
    }
    /** <保存到备忘录>
     * <功能详细描述>
     * @return
     * @see [类、类#方法、类#成员]
     */
    public Memento saveToMemento(){
        System.out.println("Saving to Memento");
        return new Memento(state);
    }
    public void restoreFromMemento(Memento m){
        state=m.getSavedState();
        System.out.println("从备忘录中获取保存点Restoring state from Memento"+state);
    }
}
