package com.zc.l19observer;

/**
 * <被观察者>
 * <功能详细描述>
 * 
 * @author  Administrator
 * @version  [版本号, 2016年12月22日]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public interface TemperatureSubject
{
    public void addObserver(TemperatureObserver temperatureObserver);
    public void removeOberver(TemperatureObserver temperatureObserver);
    public void notice();
}
