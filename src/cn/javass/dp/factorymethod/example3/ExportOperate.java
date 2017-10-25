package cn.javass.dp.factorymethod.example3;
/**
 * ʵ�ֵ������ݵ�ҵ���ܶ���,�൱�ڹ�������,���г���Ĺ�������factoryMethod�ɸù�������������ʵ��
 * ��������ģʽ������:�ø����ڲ�֪������ʵ��ʱ,�����������Ĺ���,�������ʵ���ӳٵ�������.
 */
public abstract class ExportOperate {
	/**
	 * �����ļ�
	 * @param data ��Ҫ���������
	 * @return �Ƿ�ɹ������ļ�
	 */
	public boolean export(String data){
		//ʹ�ù�������
		ExportFileApi api = factoryMethod();
		return api.export(data);
	}
	/**
	 * ���������������������ļ�����Ľӿڶ���
	 * @return �������ļ�����Ľӿڶ���
	 */
	protected abstract ExportFileApi factoryMethod();
}
