package com.zc.l19observer;

/**
 * <被观察者Subject>
 * <功能详细描述>
 * 
 * @author  Administrator
 * @version  [版本号, 2016年12月22日]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public interface TemperatureSubject
{
    /**添加观察者*/
    public void addObserver(TemperatureObserver temperatureObserver);
    /**移除观察者*/
    public void removeOberver(TemperatureObserver temperatureObserver);
    /**通知所有观察者*/
    public void notice();
}
