package com.zc.z03decorator;

/**
 * 装备接口
 */
public interface Equip {
    /**
     * 计算攻击力
     *
     * @return
     */
    public int caculateAttack();

    /**
     * 装备描述
     *
     * @return
     */
    public String description();
}
