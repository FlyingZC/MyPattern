package com.zc.l05prototype;

import java.util.Arrays;

/**
 * @author flyingzc
 * 动物的家,引用类型
 */
public class House
{
    private String houseName;
    private int houseArea;
    private String[] housePosition;
    public House()
    {
        
    }
    
    public House(String houseName, int houseArea, String[] housePosition)
    {
        this.houseName = houseName;
        this.houseArea = houseArea;
        this.housePosition = housePosition;
    }
    public String getHouseName()
    {
        return houseName;
    }
    public void setHouseName(String houseName)
    {
        this.houseName = houseName;
    }
    public int getHouseArea()
    {
        return houseArea;
    }
    public void setHouseArea(int houseArea)
    {
        this.houseArea = houseArea;
    }
    public String[] getHousePosition()
    {
        return housePosition;
    }
    public void setHousePosition(String[] housePosition)
    {
        this.housePosition = housePosition;
    }

    @Override
    public String toString()
    {
        return "House [houseName=" + houseName + ", houseArea=" + houseArea + ", housePosition="
                + Arrays.toString(housePosition) + "]";
    }
    
    
}
