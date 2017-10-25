package com.zc.z03decorator;
/**
 * 蓝宝石装饰品
 * 每颗攻击力+5
 * */
public class BlueDecorator implements EquipDecorator{
	//每个装饰品维护一件装备
	private Equip equip;
	
	public BlueDecorator(Equip equip){
		this.equip=equip;
	}
	
	@Override
	public int caculateAttack() {
		return 5+equip.caculateAttack();
	}

	@Override
	public String description() {
		return equip.description()+"镶嵌蓝宝石";
	}

}
