package com.zc.l19observer;

public class ObserverTest
{
    /**
     * 多个观察者(TemperatureCustomer1) 关注 气温站(TemperatureStation) 的温度变化
     */
    public static void main(String[] args)
    {
        TemperatureStation temperatureStation = new TemperatureStation(38);
        TemperatureCustomer1 tc1 = new TemperatureCustomer1();
        TemperatureCustomer2 tc2 = new TemperatureCustomer2();
        temperatureStation.addObserver(tc1);
        temperatureStation.addObserver(tc2);

        temperatureStation.setTemperature(34);

        temperatureStation.removeOberver(tc1);
        temperatureStation.setTemperature(35);
    }
}
