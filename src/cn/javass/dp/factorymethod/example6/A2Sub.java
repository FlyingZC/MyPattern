package cn.javass.dp.factorymethod.example6;

public class A2Sub extends A1Super {
	protected C1 createC1() {
		//������ѡ�����ʵ�֣�����������
		return new C2();
	}
}
