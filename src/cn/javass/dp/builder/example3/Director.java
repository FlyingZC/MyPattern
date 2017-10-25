package cn.javass.dp.builder.example3;

import java.util.Collection;
import java.util.Map;

/**
 * ָ���ߣ�ָ��ʹ�ù������Ľӿ�������������ļ��Ķ���
 */
public class Director {
	/**
	 * ���е�ǰ��Ҫʹ�õĹ���������
	 */
	private Builder builder;
	/**
	 * ���췽�������빹��������
	 * @param builder ����������
	 */
	public Director(Builder builder) {
		this.builder = builder;
	}
	/**
	 * ָ���������������յ�������ļ��Ķ���
	 * @param header �ļ�ͷ������
	 * @param mapData ���ݵ�����
	 * @param footer �ļ�β������
	 */
	public void construct(ExportHeaderModel header,Map<String,Collection<ExportDataModel>> mapData,ExportFooterModel footer) {
		//1���ȹ���Header
		builder.buildHeader(header);
		//2��Ȼ�󹹽�Body
		builder.buildBody(mapData);
		//3��Ȼ�󹹽�Footer
		builder.buildFooter(footer);
	}
}