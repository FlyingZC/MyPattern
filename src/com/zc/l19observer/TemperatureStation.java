package com.zc.l19observer;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * <被观察者类,温度站>
 * <功能详细描述>
 *
 * @author Administrator
 * @version [版本号, 2016年12月22日]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class TemperatureStation implements TemperatureSubject {   // 温度观察者
    private Set<TemperatureObserver> temperatureObservers;
    // 温度
    private int temperature;

    public TemperatureStation(int temperature) {
        temperatureObservers = new HashSet<TemperatureObserver>();
        this.temperature = temperature;
    }

    @Override
    public void addObserver(TemperatureObserver temperatureObserver) {
        temperatureObservers.add(temperatureObserver);
    }

    @Override
    public void removeOberver(TemperatureObserver temperatureObserver) {
        temperatureObservers.remove(temperatureObserver);
    }

    @Override
    public void notice() {
        Iterator<TemperatureObserver> it = temperatureObservers.iterator();
        while (it.hasNext()) {
            TemperatureObserver temperatureObserver = it.next();
            temperatureObserver.update(temperature);
        }
    }

    /**
     * <设置temperature并调用notice>
     * <功能详细描述>
     *
     * @param newTemperature
     * @see [类、类#方法、类#成员]
     */
    public void setTemperature(int newTemperature) {
        System.out.println("Setting temperature to : " + newTemperature);
        temperature = newTemperature;
        notice();// 通知所有观察者 温度变更
    }

}
