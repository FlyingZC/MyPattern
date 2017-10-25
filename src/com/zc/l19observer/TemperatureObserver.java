package com.zc.l19observer;

/**
 * <观察者接口>
 * <功能详细描述>
 * 
 * @author  Administrator
 * @version  [版本号, 2016年12月22日]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public interface TemperatureObserver
{
    public void update(int temperature);
}
