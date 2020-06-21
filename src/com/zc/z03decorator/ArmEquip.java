package com.zc.z03decorator;

/**
 * 武器,攻击力20
 */
public class ArmEquip implements Equip {
    @Override
    public int caculateAttack() {
        return 20;
    }

    @Override
    public String description() {
        return "屠龙刀";
    }

}
