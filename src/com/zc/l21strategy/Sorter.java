package com.zc.l21strategy;

/**
 * 排序者,拥有策略属性(strategy),该策略可动态修改  
 * @author  zhangcheng
 * @version  [版本号, 2017年7月17日]
 */
public abstract class Sorter
{
    private ISort strategy;

    /** 
     * 根据 传入的不同策略(strategy)初始化 Sorter 
     * @param strategy
     * @see [类、类#方法、类#成员]
     */
    public void setSorter(ISort strategy)
    {
        this.strategy = strategy;
    }

    public ISort getSorter()
    {
        return this.strategy;
    }

    /** 
     * 排序
     * @param listToSort
     * @see [类、类#方法、类#成员]
     */
    public abstract void doSort(int[] listToSort);
}
