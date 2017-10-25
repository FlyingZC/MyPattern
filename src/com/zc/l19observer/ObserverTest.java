package com.zc.l19observer;

public class ObserverTest
{
    public static void main(String[] args)
    {
        TemperatureStation temperatureStation=new TemperatureStation(38);
        TemperatureCustomer1 tc1=new TemperatureCustomer1();
        TemperatureCustomer2 tc2=new TemperatureCustomer2();
        temperatureStation.addObserver(tc1);
        temperatureStation.addObserver(tc2);
        
        temperatureStation.setTemperature(34);
        
        temperatureStation.removeOberver(tc1);
        temperatureStation.setTemperature(35);
    }
}
