package com.zc.l21strategy;

public class MySorter extends Sorter
{

    @Override
    public void doSort(int[] listToSort)
    {
        getSorter().sort(listToSort);
    }

}
