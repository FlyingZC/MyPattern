package cn.javass.dp.facade.example1;
/**
 * ʾ�����ɱ��ֲ��ģ��
 */
public class Presentation {
	public void generate(){
		//1�������ù��������ȡ��Ӧ��������Ϣ
		ConfigModel configModel = ConfigManager.getInstance().getConfigData();
		if(configModel.isNeedGenPresentation()){
			//2������Ҫ��ȥ������Ӧ�Ĵ��룬��������ļ�
			System.out.println("�������ɱ��ֲ�����ļ�");
		}
	}
}