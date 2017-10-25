package cn.javass.dp.factorymethod.example3;
/**
 * 实现导出数据的业务功能对象,相当于工厂方法,其中抽象的工厂方法factoryMethod由该工厂的子类自行实现
 * 工厂方法模式的意义:该父类在不知道具体实现时,可以完成自身的功能,而具体的实现延迟到子类中.
 */
public abstract class ExportOperate {
	/**
	 * 导出文件
	 * @param data 需要保存的数据
	 * @return 是否成功导出文件
	 */
	public boolean export(String data){
		//使用工厂方法
		ExportFileApi api = factoryMethod();
		return api.export(data);
	}
	/**
	 * 工厂方法，创建导出的文件对象的接口对象
	 * @return 导出的文件对象的接口对象
	 */
	protected abstract ExportFileApi factoryMethod();
}
