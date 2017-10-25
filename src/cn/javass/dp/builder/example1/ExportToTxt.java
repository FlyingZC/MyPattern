package cn.javass.dp.builder.example1;
import java.util.*;
/**
 * �������ݵ��ı��ļ��Ķ���
 */
public class ExportToTxt {
	/**
	 * �������ݵ��ı��ļ�
	 * @param header �ļ�ͷ������
	 * @param mapData ���ݵ�����
	 * @param footer �ļ�β������
	 */
	public void export(ExportHeaderModel header,Map<String,Collection<ExportDataModel>> mapData,ExportFooterModel footer){
		//������¼����������ļ�����
		StringBuffer buffer = new StringBuffer();
		//1������ƴ���ļ�ͷ������
		buffer.append(header.getDepId()+","+header.getExportDate()+"\n");
		//2��������ƴ���ļ��������
		for(String tblName : mapData.keySet()){
			//��ƴ�ӱ�����
			buffer.append(tblName+"\n");
			//Ȼ��ѭ��ƴ�Ӿ�������
			for(ExportDataModel edm : mapData.get(tblName)){
				buffer.append(edm.getProductId()+","+edm.getPrice()+","+edm.getAmount()+"\n");
			}
		}
		//3��������ƴ���ļ�β������
		buffer.append(footer.getExportUser());
		
		//Ϊ����ʾ����ԣ�����Ͳ�ȥд����ļ��Ĵ�����
		//��Ҫ������������������̨����
		System.out.println("������ı��ļ������ݣ�\n"+buffer);
	}
}
