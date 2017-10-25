package com.zc.l04singleton;

//懒汉式
public class SingletonB
{
    private SingletonB()
    {

    }

    //加volatile
    private volatile static SingletonB instance;

    public static SingletonB getInstance()
    {
        if (instance == null)
        {//1.两个线程 都有可能在instance==null时进入到这里.所以要双重判断
            synchronized (SingletonB.class)
            {
                if (instance == null)
                {
                    //因为这一条不是原子操作,大致分三步
                    /*
                     * 1.给SingletonB分配内存
                     * 2.初始化构造器
                     * 3.将instance对象指向分配的内存空间(此时instance就非null了)
                     * 重排序会导致2,3顺序不对.volatile阻止重排序
                     * */
                    instance = new SingletonB();
                }
            }
        }
        return instance;
    }
}
