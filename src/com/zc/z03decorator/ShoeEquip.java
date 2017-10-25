package com.zc.z03decorator;
/**
 * 护腕,攻击力5
 * */
public class ShoeEquip implements Equip{
	@Override
	public int caculateAttack() {
		return 5;
	}

	@Override
	public String description() {
		return "靴子";
	}
	
}
