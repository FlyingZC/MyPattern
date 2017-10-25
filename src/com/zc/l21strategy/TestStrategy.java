package com.zc.l21strategy;

public class TestStrategy
{
    public static void main(String[] args)
    {
        int[] listToBeSorted = {1, 3, 88, 34, 23, 56, 77, 8, 66};
        MySorter mySorter = new MySorter();
        //设置策略为(bubbleSort)
        mySorter.setSorter(new BubbleSort());
        mySorter.doSort(listToBeSorted);

        mySorter.setSorter(new QuickSort());
        mySorter.doSort(listToBeSorted);
    }
}
