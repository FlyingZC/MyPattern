package com.zc.l02abstractfactory.my;

/**
 * 现代内存的类
 */
public class HyMemory implements MemoryApi {
    public void cacheData() {
        System.out.println("现在正在使用现代内存" );
    }
}
