package cn.javass.dp.adapter.example1;

/**
 * 使用适配器的客户端
 */
public class Client {
    public static void main(String[] args) {
        //创建需被适配的对象
        Adaptee adaptee = new Adaptee();
        //创建客户端需要调用的接口对象
        Target target = new Adapter(adaptee);
        //用暴露给客户端的新接口对象,调用接口中的方法,处理请求.但实际上是调用了 被适配(旧的接口)中的方法
        target.request();
    }
}
