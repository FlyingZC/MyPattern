package cn.javass.dp.builder.example3;

import java.util.Collection;
import java.util.Map;

/**
 * ʵ�ֵ������ݵ��ı��ļ��ĵĹ���������
 */
public class TxtBuilder implements Builder
{
    /**
     * ������¼�������ļ������ݣ��൱�ڲ�Ʒ
     */
    private StringBuffer bufferResult = new StringBuffer();

    public void buildBody(Map<String, Collection<ExportDataModel>> mapData)
    {
        for (String tblName : mapData.keySet())
        {
            //��ƴ�ӱ�����
            bufferResult.append(tblName + "\n");
            //Ȼ��ѭ��ƴ�Ӿ�������
            for (ExportDataModel dataModel : mapData.get(tblName))
            {
                bufferResult.append(dataModel.getProductId() + "," + dataModel.getPrice() + "," + dataModel.getAmount() + "\n");
            }
        }
    }

    public void buildFooter(ExportFooterModel footer)
    {
        bufferResult.append(footer.getExportUser());
    }

    public void buildHeader(ExportHeaderModel header)
    {
        bufferResult.append(header.getDepId() + "," + header.getExportDate() + "\n");
    }

    public StringBuffer getResult()
    {
        return bufferResult;
    }
}
