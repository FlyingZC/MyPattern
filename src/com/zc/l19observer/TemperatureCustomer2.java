package com.zc.l19observer;
/**具体 温度观察者*/
public class TemperatureCustomer2 implements TemperatureObserver
{
    @Override
    public void update(int temperature)
    {
        System.out.println("Customer2 found the temperature as : " + temperature);
    }

}
