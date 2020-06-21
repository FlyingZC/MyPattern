package com.zc.l09decorator.my;

/**
 * @author flyingzc
 * 具体被装饰类
 */
public class ObjConcret extends Obj {

    @Override
    protected String getSum() {
        return "[具体被装饰类]";
    }

}
