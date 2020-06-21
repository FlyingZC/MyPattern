package cn.javass.dp.factorymethod.example3;

public class Client {
    public static void main(String[] args) {
        //创建需要使用的Creator对象.ExportOperate为Creator接口,ExportDBOperate为具体实现,内部包含实现的factoryMethod()
        ExportOperate operate = new ExportDBOperate();
        //调用输出数据的功能方法,实际上调用父类ExportOperate中的方法
        operate.export("测试数据" );
    }
}
