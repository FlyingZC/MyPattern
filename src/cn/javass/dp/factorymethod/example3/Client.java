package cn.javass.dp.factorymethod.example3;

public class Client {
	public static void main(String[] args) {
		//������Ҫʹ�õ�Creator����.ExportOperateΪCreator�ӿ�,ExportDBOperateΪ����ʵ��,�ڲ�����ʵ�ֵ�factoryMethod()
		ExportOperate operate = new ExportDBOperate();
		//����������ݵĹ��ܷ���,ʵ���ϵ��ø���ExportOperate�еķ���
		operate.export("��������");
	}
}
