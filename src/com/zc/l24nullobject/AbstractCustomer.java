package com.zc.l24nullobject;

public abstract class AbstractCustomer
{
    protected String name;

    /** <一句话功能简述>判断是否是真实的Customer(是否为null)
     * <功能详细描述>
     * @return
     * @see [类、类#方法、类#成员]
     */
    public abstract boolean isNil();

    public abstract String getName();
}
