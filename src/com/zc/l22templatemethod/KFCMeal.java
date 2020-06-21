package com.zc.l22templatemethod;

public class KFCMeal extends Lunch {

    @Override
    public void prepareFood() {
        System.out.println("KFC is preparing food" );
    }

    @Override
    public void cooking() {
        System.out.println("KFC is cooking" );
    }

    @Override
    public void cleaning() {
        System.out.println("KFC is cleaning" );
    }

}
