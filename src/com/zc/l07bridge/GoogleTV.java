package com.zc.l07bridge;

public class GoogleTV implements TV{

	@Override
	public void powerOn() {
		System.out.println("googleTV powerOn");
	}

	@Override
	public void powerOff() {
		System.out.println("googleTV powerOff");
	}

	@Override
	public void changeChannel(int channel) {
		System.out.println("googleTV changeChanel");
	}

}
