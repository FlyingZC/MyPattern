package cn.javass.dp.abstractfactory.example4;

/**
 * ����չ�ĳ��󹤳��Ľӿ�
 */
public interface AbstractFactory {
	/**
	 * һ��ͨ�õĴ�����Ʒ����ķ�����Ϊ�˼򵥣�ֱ�ӷ���Object
	 * Ҳ����Ϊ���б������Ĳ�Ʒ����һ�������Ľӿ�
	 * @param type ���崴���Ĳ�Ʒ(�ӿ�)���ͱ�ʶ,��cpu,����,���ȵ�
	 * @return �������Ĳ�Ʒ����
	 */
	public Object createProduct(int type);
}