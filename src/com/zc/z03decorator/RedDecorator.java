package com.zc.z03decorator;

/**
 * 红宝石装饰品
 * 每颗攻击力+15
 */
public class RedDecorator implements EquipDecorator {
    //每个装饰品维护一件装备
    private Equip equip;

    public RedDecorator(Equip equip) {
        this.equip = equip;
    }

    @Override
    public int caculateAttack() {
        return 15 + equip.caculateAttack();
    }

    @Override
    public String description() {
        return equip.description() + "镶嵌红宝石";
    }

}
