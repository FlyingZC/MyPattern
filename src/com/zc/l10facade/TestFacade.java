package com.zc.l10facade;
//客户端类,只与一个接口交互.也只有和该接口交互的权限
//门面系统提供一个简单的接口为客户端简化了与复杂系统的交互
public class TestFacade {
	public static void main(String[] args) {
		MyGUI facade=new MyGUI();
		facade.drawGUI();
	}
}
