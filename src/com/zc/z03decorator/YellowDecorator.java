package com.zc.z03decorator;
/**
 * 黄宝石装饰品
 * 每颗攻击力+10
 * */
public class YellowDecorator implements EquipDecorator{
	//每个装饰品维护一件装备
	private Equip equip;
	
	public YellowDecorator(Equip equip){
		this.equip=equip;
	}
	
	@Override
	public int caculateAttack() {
		return 10+equip.caculateAttack();
	}

	@Override
	public String description() {
		return equip.description()+"镶嵌黄宝石";
	}

}
