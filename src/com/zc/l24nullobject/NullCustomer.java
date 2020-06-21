package com.zc.l24nullobject;

public class NullCustomer extends AbstractCustomer {

    @Override
    public String getName() {
        return "这是一个不存在的Customer";
    }

    @Override
    public boolean isNil() {
        return true;
    }
}
