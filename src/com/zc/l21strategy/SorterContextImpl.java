package com.zc.l21strategy;

public class SorterContextImpl extends SorterContext {

    @Override
    public void doSort(int[] listToSort) {
        getSorter().sort(listToSort);
    }

}
