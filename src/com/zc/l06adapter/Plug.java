package com.zc.l06adapter;

/**
 * 三口插头,需要被适配的对象  
 * @author  zhangcheng
 * @version  [版本号, 2017年7月17日]
 */
public class Plug
{
    private String spec;

    public Plug()
    {
        spec = "三口插头";
    }

    public String getInput()
    {
        return spec;
    }
}
