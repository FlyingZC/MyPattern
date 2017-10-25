package com.zc.z02observer;

public class T01Observer {
	public static void main(String[] args) {
		//模拟一个公众号
		BaseSubject sub=new BaseSubject();
		//用户A
		Observer ob1=new ObserverA(sub);
		Observer ob2=new ObserverB(sub);
		sub.setMsg("公众号发送了一条信息");
		sub.setMsg("公众号再次发送了一条信息");
	}
}
