package cn.javass.dp.adapter.example1;
/**
 * ʹ���������Ŀͻ���
 */
public class Client {	
	public static void main(String[] args) {
		//�����豻����Ķ���
		Adaptee adaptee = new Adaptee();
		//�����ͻ�����Ҫ���õĽӿڶ���
		Target target = new Adapter(adaptee);
		//�ñ�¶���ͻ��˵��½ӿڶ���,���ýӿ��еķ���,��������.��ʵ�����ǵ����� ������(�ɵĽӿ�)�еķ���
		target.request();
	}
}
