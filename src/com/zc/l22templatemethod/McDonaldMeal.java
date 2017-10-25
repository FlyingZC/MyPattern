package com.zc.l22templatemethod;

public class McDonaldMeal extends Lunch
{

    @Override
    public void prepareFood()
    {
        System.out.println("Mc is preparing food...");
    }

    @Override
    public void cooking()
    {
        System.out.println("Mc is cooking");
    }

    @Override
    public void cleaning()
    {
        System.out.println("Mc is cleaning");
    }

}
