package cn.javass.dp.factorymethod.example3;
/**
 * ���������ݿⱸ���ļ���ʽ�Ķ���,�൱�ھ����Product
 */
public class ExportDB implements ExportFileApi{
    
	public boolean export(String data) {
		//��ʾ��һ�£�������Ҫ�������ݿ���ļ�
		System.out.println("��������"+data+"�����ݿⱸ���ļ�");
		return true;
	}
}
