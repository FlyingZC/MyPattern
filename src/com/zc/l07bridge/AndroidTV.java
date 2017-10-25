package com.zc.l07bridge;

public class AndroidTV implements TV{

	@Override
	public void powerOn() {
		System.out.println("AndroidTV powerOn");
	}

	@Override
	public void powerOff() {
		System.out.println("AndroidTV powerOff");
	}

	@Override
	public void changeChannel(int channel) {
		System.out.println("AndroidTV changeChanel");
	}

}
