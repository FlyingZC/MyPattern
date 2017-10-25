package com.zc.l07bridge;

public class Test {
	public static void main(String[] args) {
		AutoTVRemoteControl control=new AutoTVRemoteControl();
		control.setTV(new GoogleTV());
		control.powerOn();
		control.nextChannel();
		control.powerOff();
	}
}
