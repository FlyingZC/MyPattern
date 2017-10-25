package cn.javass.dp.abstractfactory.example2;

/**
 * ���󹤳��Ľӿڣ��������������Ʒ����Ĳ���.�Ǿ��幤����Ľӿ�
 */
public interface AbstractFactory
{
    /**
     * ʾ�����������������ƷA�Ķ���
     * @return �����ƷA�Ķ���
     */
    public AbstractProductA createProductA();

    /**
     * ʾ�����������������ƷB�Ķ���
     * @return �����ƷB�Ķ���
     */
    public AbstractProductB createProductB();
}
