package com.zc.l19observer;

public class TemperatureCustomer1 implements TemperatureObserver
{
    @Override
    public void update(int temperature)
    {
        System.out.println("Customer 1 found the temperature as:"+temperature);
    }

}
