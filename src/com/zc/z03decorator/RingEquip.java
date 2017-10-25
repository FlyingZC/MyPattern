package com.zc.z03decorator;
/**
 * 戒指,攻击力5
 * */
public class RingEquip implements Equip{
	@Override
	public int caculateAttack() {
		return 5;
	}

	@Override
	public String description() {
		return "魔戒";
	}
	
}
