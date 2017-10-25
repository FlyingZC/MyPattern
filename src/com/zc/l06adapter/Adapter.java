package com.zc.l06adapter;

/**
 * 适配器类 ,继承自被适配器类,同时实现标准接口(目标类,最终要转换成的类)
 * 将 三孔插头 转换为 两孔插头 
 * @author  zhangcheng
 * @version  [版本号, 2017年7月17日]
 */
public class Adapter extends Plug implements Socket
{
    //该方法将3孔(从插头输入)电源 转成2孔(输入到)
    @Override
    public String getInput()
    {
        //调用基类的输入流
        String input = super.getInput();
        input = input + "转换成2-Pin";
        return input;
    }

}
