package com.zc.z03decorator;

public class Test {
    public static void main(String[] args) {
        System.out.println("一个镶嵌2颗红宝石,1颗蓝宝石的靴子" );
        Equip equip = new RedDecorator(new RedDecorator(new BlueDecorator(new ShoeEquip())));
        System.out.println("攻击力:" + equip.caculateAttack());
        System.out.println("描述:" + equip.description());
        System.out.println("-------" );
        // 一个镶嵌1颗红宝石，1颗蓝宝石的武器  
        System.out.println(" 一个镶嵌1颗红宝石，1颗蓝宝石,1颗黄宝石的武器" );
        equip = new RedDecorator(new BlueDecorator(new YellowDecorator(new ArmEquip())));
        System.out.println("攻击力  : " + equip.caculateAttack());
        System.out.println("描述 :" + equip.description());
        System.out.println("-------" );
    }
}
