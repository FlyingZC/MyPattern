package com.zc.l05prototype.deep;

import java.util.Arrays;

/**
 * @author flyingzc
 * 动物的家,引用类型
 */
public class House implements Cloneable {
    private String houseName;
    private int houseArea;
    private String[] housePosition;

    public House() {

    }

    public House(String houseName, int houseArea, String[] housePosition) {
        this.houseName = houseName;
        this.houseArea = houseArea;
        this.housePosition = housePosition;
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public int getHouseArea() {
        return houseArea;
    }

    public void setHouseArea(int houseArea) {
        this.houseArea = houseArea;
    }

    public String[] getHousePosition() {
        return housePosition;
    }

    public void setHousePosition(String[] housePosition) {
        this.housePosition = housePosition;
    }

    @Override
    public String toString() {
        return "House [houseName=" + houseName + ", houseArea=" + houseArea + ", housePosition="
                + Arrays.toString(housePosition) + "]";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        House clone = null;
        clone = (House) super.clone();
        // clone.setHouseName(new String(houseName));
        return clone;
    }
}
