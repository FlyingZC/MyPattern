package cn.javass.dp.factorymethod.example6;

/**
 * @author Flyingzc
 * ʹ�ù�������ģʽ,ģ�� IOC/DI
 */
public class A {
	/**
	 * �ȴ���ע�����
	 */
	private C c = null;
	/**
	 * ע����ԴC�ķ���
	 * @param c ��ע�����Դ
	 */
	public void setC(C c){
		this.c = c;
	}
	public void t1(){
		//������Ҫʹ��C�࣬�����ֲ�������ȥ����C�ˣ���ô�죿
		//������Ҫ����ⲿע�룬������ʡ�ģ�
		//�Լ����ù���ô��ȡC��ֱ��ʹ�þͺ���
		c.tc();
	}
}